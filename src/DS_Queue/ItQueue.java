package DS_Queue;


import java.util.Iterator;

import DS_LinkedList.Node;


public class ItQueue<T> extends LinkedQueue<T> implements Queue<T>, Iterable<T> {



    public String toString() { // override toString method to apply the iterator
        String ans = "ItQueue<T>:  ";
        for (T x : this)
            ans += x + " ";
        return ans;
    }

    public static void main(String args[]) {
        ItQueue<String> q = new ItQueue<String>();
        ArrayQueue.testQueue(q);




    }



    public Iterator<T> iterator(){
        return new QueueIterator<T>(front);
    }


    class QueueIterator<T> implements Iterator<T>{

        private Node<T> current;

        public QueueIterator(Node<T> current){
            this.current=current;
        }


        @Override
        public boolean hasNext() {

            return current !=null;
        }

        @Override
        public T next() {

            T answer =current.getData();
            current =current.getNext();
            return answer;


        }

        @Override
        public void remove() {

            throw new UnsupportedOperationException();
        }

        }
    }
