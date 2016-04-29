import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringJoiner;

/**
 * Created by ricardo on 21/04/16.
 */
public class Calculator {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    HashSet<String> operators = new HashSet<String>();
    String outputFile;
    String inputFile;

    /**
     * 
     * @param inputFile
     * @param outputFile 
     */
    public Calculator(String inputFile, String outputFile){
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        operators.add("^");
    }

    /**
     * 
     * @param expression
     * @return 
     */
    public boolean validate(String expression){
        int opening = 0;
        int closing = 0;

        for(char c : expression.toCharArray()){
            if(c == '('){
                opening++;
            }else if(c == ')'){
                closing++;
            }
        }
        return opening == closing;
    }

    public void validateExpression(){
        FileHandler reader = new FileHandler();
        
        String result = "";
        ArrayList<String> expressions = reader.read(inputFile);
           
        for(int i=0; i<expressions.size(); i++) {
            String expression = expressions.get(i);
            //Validade
            if(validate(expression)){
                result = this.calculateExpression(expression);
            }else{
                result = "Expressão inválida";
            }
            
            FileHandler fh = new FileHandler();
            try{
                fh.write(outputFile, expression);
                fh.write(outputFile, "Resultado: "+result);
            }catch(FileNotFoundException e){
                System.out.println("FileHandler error: "+e.getMessage());
            }catch(UnsupportedEncodingException e){
                System.out.println("FileHandler error: "+e.getMessage());
            }
        }
    }

    /**
     * 
     * @param str
     * @return boolean
     */
    public boolean isOperator(String str){
        return operators.contains(str);
    }

    /**
     * 
     * @param str
     * @return boolean
     */
    public boolean isOperand(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    /**
     * 
     * @param op2
     * @param operator
     * @param op1
     * @return String
     */
    public String calculate(String op2, String operator, String op1){
        double result = 0;
        switch (operator){
            case "+":
                result = Double.parseDouble(op1)+Double.parseDouble(op2);
                break;
            case "-":
                result = Double.parseDouble(op1)-Double.parseDouble(op2);
                break;
            case "*":
                result = Double.parseDouble(op1)*Double.parseDouble(op2);
                break;
            case "/":
                result = Double.parseDouble(op1)/Double.parseDouble(op2);
                break;
            case "^":
                result = Math.pow(Double.parseDouble(op1), Double.parseDouble(op2));
                break;
        }
        return String.valueOf(result);
    }
    
    /**
     * 
     * @param exp
     * @return String
     */
    public String calculateExpression(String exp){
        Stack s = new Stack();
        String str = "";

        for(int i=0; i<exp.length(); i++){
            String token = String.valueOf(exp.charAt(i));
            if(token.equals(" ")){
                if(!str.equals("")) {
                    s.push(str);
                    str = "";
                }
            }else if(token.equals("(")){
                continue;
            }else if(isOperand(token)){
                str += token;
            }else if(isOperator(token)){
                s.push(token);
            }else if(token.equals(")")){
                String resultado = calculate(s.pop(), s.pop(), s.pop());
                s.push(resultado);
            }
        }
        return s.top();
    }
}