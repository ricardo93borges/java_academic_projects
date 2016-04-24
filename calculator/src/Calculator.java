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

    public Calculator(){
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        operators.add("^");
    }

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

    public void calculate(){
        Reader reader = new Reader();

        ArrayList<String> expressions = reader.read("/home/ricardo/workspace/calculator/src/expressoes.txt");

        for(int i=0; i<expressions.size(); i++) {
            String expression = expressions.get(i);
            //Validade
            System.out.println(expression);
            if(validate(expression)){
                //Stack expression
                this.in2post(expression);
                System.out.println();
            }else{
                //Invalid expression
                System.out.println("Expressão inválida");
            }
        }
    }

    public boolean isOperator(String str){
        return operators.contains(str);
    }

    public boolean isOperand(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public String calc(String op1, String op2, String operator){
        System.out.println(op1+op2+operator);
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

    public void in2post(String exp){
        Stack s = new Stack();
        Stack p = new Stack();
        String str = "";

        for(int i=0; i<exp.length(); i++){
            String token = String.valueOf(exp.charAt(i));
            System.out.print(token);
            if(token.equals(" ")){
                if(!str.equals("")) {
                    p.push(str);
                    str = "";
                }
            }else if(token.equals("(")){
                s.push(token);
            }else if(isOperand(token)){
                str += token;
                //p.push(token);
            }else if(isOperator(token)){
                s.push(token);
            }else if(token.equals(")")){
                if(isOperator(s.top())){
                    String resultado = calc(p.pop(), p.pop(), s.pop());
                    p.push(resultado);
                    //p.push(s.pop());
                }
            }
        }

        while (!s.isEmpty()){
            if(isOperator(s.top())){
                String resultado = calc(p.pop(), p.pop(), s.pop());
                p.push(resultado);
                //p.push(s.pop());
            }else {
                s.pop();
            }
        }

        while (!p.isEmpty()){
            System.out.print(p.pop()+",");
        }
    }

    public void infixToPostfix(String infix) {
        Stack postfix = new Stack();
        Stack s = new Stack();
        String str = "";

        for (int i=0; i < infix.length(); i++) {
            String element = String.valueOf(infix.charAt(i));

            if (element.equals("(")) {
                continue;
            }else if (element.equals(")")) {
                String oper = s.top();
                while (!(oper.equals("(")) && !(s.isEmpty())) {
                    postfix.push(oper);
                    s.pop();
                    oper = s.top();
                }
                s.pop();
            }else if (element.equals("+") || element.equals("-")) {
                if (s.isEmpty()) {
                    s.push(element);
                } else {
                    while (!(s.isEmpty() || s.top().equals("(") || s.top().equals(")"))) {
                        postfix.push(s.pop());
                    }
                    s.push(element);
                }
            }else if (element.equals("*") || element.equals("/")) {
                if (s.isEmpty()) {
                    s.push(element);
                } else {
                    while (!s.top().equals("+") && !s.top().equals("-") && !s.isEmpty()) {
                        postfix.push(s.pop());
                    }
                    s.push(element);
                }
            }else {
                if(!element.equals(" ")){
                    str += element;
                }else{
                    if(!str.equals("")) {
                        postfix.push(str);
                        str = "";
                    }
                }

            }
        }
        while (!s.isEmpty()) {
            String oper = s.top();
            if (!oper.equals("(")) {
                s.pop();
                postfix.push(oper);
            }
        }
        while (!postfix.isEmpty()){
            System.out.print(postfix.pop()+",");
        }
    }



    /*public String EvaluatePostFix(String postfix) {
        Stack resultStack = new Stack();
        int length = postfix.length();
        for (int i = 0; i < length; i++) {
            if (operators.contains(String.valueOf(postfix.charAt(i)))) {
                int result = ApplyOperator(Integer.parseInt(resultStack.pop()), Integer.parseInt(resultStack.pop()), postfix.charAt(i));
                resultStack.push(String.valueOf(result));
            }else if(StringToInt(String.valueOf(postfix.charAt(i))) > -1){
                resultStack.push(String.valueOf(postfix.charAt(i)));
            }
        }
        return resultStack.pop();
    }*/

}
