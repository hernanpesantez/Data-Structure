package DS_Stak;


import DS_LinkedList.Node;
import DS_Stak.Stack;

public class LinkedStack<T> implements Stack<T> {

    private Node<T> top;
    private int size;


    public LinkedStack(){
        top=null;
        size=0;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T pop() throws Exception{
        if (size==0){
            throw new Exception("Empty");
        }
        T answer=top.getData();
        top=top.getNext();
        size--;
        return answer;
    }



    @Override
    public void push(T data) {
        Node<T> newTop=new Node<>(data,top);
        top=newTop;
        size++;

    }

    public String toString() {
        String ans = "LinkedStack<T>:";
        Node<T> n = top;
        while (n != null) {
            ans += (n.getData() + "->");
            n = n.getNext();
        }
        return ans;
    }
}
