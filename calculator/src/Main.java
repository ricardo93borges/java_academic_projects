import java.util.ArrayList;

/**
 * Created by ricardo on 21/04/16.
 */
public class Main {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.calculate();


        /*LinkedListOfString list = new LinkedListOfString();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("Element: "+list.get(0));
        //list.add(2,4);
        //System.out.println("Element: "+list.get(2));
        list.set(2,"3");
        System.out.println("Element: "+list.get(1));
        //list.remove("2");
        System.out.println("Element: "+list.get(2));
        */
/*
        Reader reader = new Reader();
        Calculator c = new Calculator();
        ArrayList<String> m = reader.read("/home/ricardo/workspace/calculator/src/expressoes.txt");
        for(int i=0; i<m.size(); i++) {
            System.out.println(m.get(i));
            if(c.validate(m.get(i))) {
                System.out.println("valido");
            }else{
                System.out.println("invalido");
            }
        }*/
    }

}

