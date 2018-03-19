package DS_LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList(){
        head=tail=null;
        size=0;
    }

    //utility methods

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void addHead(T d){
        Node<T> n=new Node<>(d,head);
        head=n;
        size++;
        if(tail==null){
            tail=head;
        }

    }

    public void addTail(T d){
        Node<T> n=new Node<>(d,null);
        if(tail==null){
            head=tail=null;
        }else {
            tail.setNext(n);
            tail=n;
        }
        size++;
    }

    public T removeHead()throws Exception{
        if(head==null){
            throw  new Exception("Empty list!");
        }
        Node<T> n=head;
        head=head.getNext();
        if(head==null){
            tail=head;
        }
        size--;
        return n.getData();

    }

    public String toString() {
        String ans = "";
        Node<T> n = head;
        ans += "(H)-->";
        while (n != null) {
            ans += n.getData();
            ans += "-->";
            n = n.getNext();
        }
        return ans + "(T)";
    }







}
