package BinaryTrees;

import DS_LinkedList.Node;

import java.util.ArrayList;
import java.util.Iterator;

public class BNode<T> extends Node<T> {
    BNode<T> left, right;

    public BNode(T data, BNode<T> parent, BNode<T> left, BNode<T> right){
        setData(data);
        setParent(parent);
        this.left=left;
        this.right=right;
    }
    public void setLeft(BNode<T> left){
        this.left=left;

    }
    public void setRight(BNode<T> right){
        this.right=right;

    }

    public BNode<T> getLeft(){
        return left;
    }

    public BNode<T> getRight(){
        return right;
    }

    public Iterator<BNode<T>> chlidren(){
        ArrayList<BNode<T>> v = new ArrayList<>();
        if(left!=null){
            v.add(left);
        }
        if(left!=null){
            v.add(right);
        }
        return v.iterator();
    }

    public void removeChild(BNode<T> n){
        if(getLeft()==n){
            setLeft(null);
        }
        else {
            setRight(null);
        }

    }

    public String toString(){
        return "Node"+ getData();
    }

}
