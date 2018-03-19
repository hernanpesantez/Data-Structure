package DS_Stak;


import javax.xml.bind.annotation.XmlType;

public class ArrayStack<T> implements Stack<T> {

    private T data[];
    private int top;
    private static final int DEFAULT_SIZE = 100;

    public ArrayStack() {
        data = (T[]) new Object[DEFAULT_SIZE];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public void push(T d) {
        if (size() == DEFAULT_SIZE) {
            System.out.println("Array is full");

        } else {
            data[size()] = d;
        }
        top++;
    }


    @Override
    public T pop() {

        if (size() == -1) {
            System.out.println("Array is empty");
            return null;
        } else {


            return data[size()];



        }

    }
}
