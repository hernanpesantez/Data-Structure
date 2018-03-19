package DS_Queue;

import DS_LinkedList.Node;
import java.util.Scanner;

public class LinkedQueue<T> implements Queue<T> {


    protected Node<T> front, rear;
    int size;


    public LinkedQueue() {

        front = rear = null;
        size = 0;
    }

    @Override
    public T dequeue() throws Exception{
        if(empty()){
            throw new Exception("Empty Queue");
        }
        T answer=front.getData();
        size--;
        if(front==null){
            rear=front;
        }

        return answer;

    }


    @Override
    public void enqueue(T data) throws Exception{

        Node<T> newRear =new Node<>(data,null);

        if(rear!=null){
            rear.setNext(newRear);
        }else {
            front=newRear;
        }
        rear=newRear;
        size++;

    }

    @Override
    public boolean empty() {
        return size==0;
    }


    @Override
    public int size() {
        return size;
    }



    public String toString() {
        String ans = "Linked Queue<T>:  ";
        Node<T> n = front;
        while (n != null) {
            ans += (n.getData() + " -> ");
            n = n.getNext();
        }
        return ans;
    }


    public static void main(String args[]) {
        Queue<String> q = new LinkedQueue<String>();
        testQueue(q);
    }



    public static void testQueue(Queue<String> q) {
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        while (!done) {
            try {
                System.out.print(q + "  ");
                System.out.println("\ncmds are + - Q: >>");
                String cmd = sc.next();
                String entry = null;
                char command = cmd.charAt(0);
                if (command == '+')
                    entry = sc.next();
                switch (cmd.charAt(0)) {
                    case 'Q':
                        done = true;
                        break;
                    case '+':
                        q.enqueue(entry);
                        break;
                    case '-':
                        q.dequeue();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        }
        sc.close();
    }
}


