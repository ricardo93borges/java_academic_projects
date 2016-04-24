/**
 * Created by ricardo on 21/04/16.
 */
public class LinkedListOfInteger {

    private static class Node<Integer>{
        private int element;
        private Node<Integer> next;
        public Node(int element, Node<Integer> next){
            this.element = element;
            this.next = next;
        }
    }

    private Node<Integer> head = null;
    private Node<Integer> tail = null;
    private int count = 0;

    public LinkedListOfInteger(){
        head = null;
        tail = null;
        count = 0;
    }

    public int size(){
        return count;
    }

    public void add(int element){
        Node n = new Node(element, null);
        if(count == 0){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            tail = n;
        }
        count++;
    }

    public int get(int index){
        if(index < 0 || index >=count){
            return -1;
        }
        Node aux = head;
        for(int i=0; i<index; i++){
            aux = aux.next;
        }
        return aux.element;
    }

    public void add(int index, int element){
        if(index < 0 || index > count){
            System.out.println("erro");
            return;
        }
        Node n = new Node(element, null);
        if(index == 0){
            if(count == 0){
                tail = n;
                head = n;
            }else {
                n.next = head;
                head = n;
            }
        }else if(index == count) {
            tail.next = n;
            tail = n;
        }else {
            Node aux = head;
            for(int i=0; i<index-1; i++){
                aux = aux.next;
            }
            n.next = aux.next;
            aux.next = n;
        }
        count++;
    }

    public int set(int index, int element){
        if(index < 0 || index > count){
            System.out.println("erro");
            return -1;
        }
        Node aux = head;
        for(int i=0; i<index; i++){
            aux = aux.next;
        }
        int e = aux.element;
        aux.element = element;
        return e;
    }

    boolean remove(int element){
        if(count == 0) return false;
        if(element == head.element){
            head = head.next;
            if(count == 1) tail = null;
            count--;
            return true;
        }

        Node aux = head.next;
        Node ant = head;
        while (aux != null){
            if(element == aux.element){
                if(aux == tail){
                    tail = ant;
                    tail.next = null;
                }else {
                    ant.next = aux.next;
                }
                count --;
                return true;
            }else {
                aux = aux.next;
                ant = ant.next;
            }
        }
        return false;
    }
}
