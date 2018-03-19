package BinaryTrees;

import Trees.Tree;

import java.util.ArrayList;

public class BinaryTree<T> extends Tree<T> {
    public BinaryTree() {
        super();
    }

    public void addRoot(T x) throws Exception {
        if (root != null) throw new Exception("The tree is not empty");
        root = new BinaryNode<T>(x, null, null, null);
        size++;
    }

    public void addLeft(BinaryNode<T> n, T x) throws Exception {
        if (n.getLeft() != null) throw new Exception("Already used");
        n.setLeft(new BinaryNode<T>(x, n, null, null));
        size++;
    }

    public void addRight(BinaryNode<T> n, T x) throws Exception {
        if (n.getRight() != null) throw new Exception("Already used");
        n.setRight(new BinaryNode<T>(x, n, null, null));
        size++;
    }

    // returns the parent of the removed node
    public BinaryNode<T> removeNode(BinaryNode<T> n) {
        if (isLeaf(n)) {  // base case
            BinaryNode<T> p = (BinaryNode<T>) parent(n);
            if (p == null) root = null;
            else p.removeChild(n);
            size--;
            return p;
        }
        if (n.getLeft() != null) {
            BinaryNode<T> m = rightmostLeftDescendant(n);
            n.setData(m.getData());
            return removeNode(m);   // recursively remove rightmost left descendant
        }
        // otherwise n does have a right child
        BinaryNode<T> m = leftmostRightDescendant(n);
        n.setData(m.getData());
        return removeNode(m);
    }

    public BinaryNode<T> leftmostRightDescendant(BinaryNode<T> n) {
        BinaryNode<T> m = n.getRight();
        while (m.getLeft() != null) m = m.getLeft();
        return m;
    }

    public BinaryNode<T> rightmostLeftDescendant(BinaryNode<T> n) {
        BinaryNode<T> m = n.getLeft();
        while (m.getRight() != null) m = m.getRight();
        return m;
    }

    public ArrayList<BinaryNode<T>> inOrder() {
        ArrayList<BinaryNode<T>> answer = new ArrayList<BinaryNode<T>>();
        inOrder((BinaryNode<T>) root(), answer);
        return answer;
    }

    public void inOrder(BinaryNode<T> n, ArrayList<BinaryNode<T>> v) {
        if (n == null) return;
        inOrder(n.getLeft(), v);
        v.add(n);
        inOrder(n.getRight(), v);
    }

    public ArrayList<BinaryNode<T>> flatOrder() {
        return inOrder();
    }
}