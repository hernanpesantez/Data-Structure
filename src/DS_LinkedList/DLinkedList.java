
package DS_LinkedList;

public class DLinkedList <T>{
    //doubly linked list uses header and trailer sentinels

    private DNode<T> header, trailer;
    private int size;
    public DLinkedList(){
        size=0;
        header=new DNode<>(null,null,null);
        trailer=new DNode<>(null,header,null);
        header.setNext(trailer);

    }

    public int size(){
        return size;
    }
    public boolean iseEmpty(){
        return size==0;
    }

    // give clients access to nodes, but not to the header or trailer

    public DNode<T> getFirst()throws Exception{
        if(iseEmpty()){
            throw new Exception("Empty");
        }
        return header.getNext();
    }



}
