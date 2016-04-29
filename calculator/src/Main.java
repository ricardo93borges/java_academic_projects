import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by ricardo on 21/04/16.
 */
public class Main {
    public static void main(String[] args){
        ClassLoader classLoader = Calculator.class.getClassLoader();
        File classpathRoot = new File(classLoader.getResource("").getPath());
        String path = classpathRoot.getPath();

        String inputFile  = path+"/../../src/calculator/expressoes.txt";
        String outputFile = path+"/../../src/calculator/resultados.txt";
        
        Calculator c = new Calculator(inputFile, outputFile);
        c.validateExpression();
    }

}

