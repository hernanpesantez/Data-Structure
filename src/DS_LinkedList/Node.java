package DS_LinkedList;

public class Node<T> {
    private T data;
    private Node<T> next;


    public Node(){
        data=null;
        next=null;
    }

    public Node(T data, Node<T> next){
        this.data=data;
        this.next=next;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setParent(Node<T> newParent){

    }




    public String toString() {
        Node<T> seenBefore = this;
        String ans = "";
        int count = 0;
        Node<T> node = this;
        while (node != null) {
            ans += node.getData();
            ans += "-->";
            node = node.getNext();
            if (++count % 2 == 0) seenBefore = seenBefore.getNext();
            if (node == seenBefore) {
                ans += " ... ";
                break;
            }
        }
        return ans + "=";
    }

}

