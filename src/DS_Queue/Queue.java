package DS_Queue;

import java.util.concurrent.ExecutionException;

public interface Queue<T> {
    public T dequeue() throws Exception;
    public void enqueue(T data) throws Exception;
    public boolean empty();
    public int size();
}
