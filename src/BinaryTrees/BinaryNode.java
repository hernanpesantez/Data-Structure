package BinaryTrees;

import DS_LinkedList.Node;
import java.util.ArrayList;
import java.util.Iterator;

public class BinaryNode<T> extends Node<T> {
    BinaryNode<T> left, right;

    public BinaryNode(T data, BinaryNode<T> parent,BinaryNode<T> left,BinaryNode<T> right){
        setData(data);
        setParent(parent);
        this.left=left;
        this.right=right;
    }
    public void setLeft(BinaryNode<T> left){
        this.left=left;

    }
    public void setRight(BinaryNode<T> right){
        this.right=right;

    }

    public BinaryNode<T> getLeft(){
        return left;
    }

    public BinaryNode<T> getRight(){
        return right;
    }

    public Iterator<BinaryNode<T>> chlidren(){
        ArrayList<BinaryNode<T>> v = new ArrayList<>();
        if(left!=null){
            v.add(left);
        }
        if(left!=null){
            v.add(right);
        }
        return v.iterator();
    }

    public void removeChaild(BinaryNode<T> n){
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
