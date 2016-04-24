import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ricardo on 21/04/16.
 */
public class Reader {

    public Reader(){

    }

    public ArrayList read(String arquivo){
        ArrayList<String> matriz = new ArrayList();
        try{
            Scanner scanner = new Scanner(new File(arquivo));
            scanner.useDelimiter("\n");

            while (scanner.hasNext()){
                String line = scanner.next();
                matriz.add(line);
            }
            scanner.close();

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return matriz;
    }
}
