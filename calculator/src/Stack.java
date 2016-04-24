/**
 * Created by ricardo on 21/04/16.
 */
public class Stack {
    private LinkedListOfString data;
    private int count;

    public Stack(){
        data = new LinkedListOfString();
        count = 0;
    }

    public void push(String element){
        data.add(count, element);
        count++;
    }

    public String pop(){
        if(count == 0){
            return "Erro";
        }
        String aux = data.get(count-1);
        count --;
        return aux;
    }

    public int size(){
        return count;
    }

    public String top(){
        if(count == 0){
            return "Erro";
        }
        return data.get(count-1);
    }

    public void clear(){
        count = 0;
    }

    public boolean isEmpty(){
        return count == 0;
    }

}