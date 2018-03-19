package Iterator;

public interface Iterator<T> {


    //Returns: true if the iteration has more elements.
    public boolean hasNext();


    // Throws: NoSuchElementException - if the iteration has no more elements
    // Return: the next element in the iteration
    public T next();

    //Removes from the underlying collection the last element returned by this iterator (optional operation).
    //Trows: UnsupportedOperationException - if the remove operation is not supported by this iterator
    //IllegalStateException - if the next method has not yet been called,
    public void remove();


}
