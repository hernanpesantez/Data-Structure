package DS_Stak;

public interface Stack<T> {
    public T pop()throws Exception;
    public void push(T data);
    public boolean empty();
    public int size();
}
