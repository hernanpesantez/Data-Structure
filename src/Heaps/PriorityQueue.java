package Heaps;

public interface PriorityQueue<T> extends Comparable<T> {

    public void add(T d) throws Exception;
    public T remove(T d)throws  Exception;

}
