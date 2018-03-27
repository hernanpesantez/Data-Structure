package BinaryTrees;



import java.util.Scanner;

public class BTreeApp {
        public static void main(String args[]) {
            BinaryTree<String> g = new BinaryTree<>();
            BNode<String> cursor = null;
            Scanner s = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println(g.treePrint(null)
                            + "  commands act at the *cursor*:  l r X . > < ^ H S Q:");
                    String cmd = s.next();
                    if (cmd.charAt(0) == 'Q') break;
                    if (cmd.charAt(0) == 'H') System.out.println(g.height());
                    if (cmd.charAt(0) == 'S') System.out.println(g.size());
                    if (cmd.charAt(0) == 'X' && cursor != null) {
                        g.removeNode(cursor);
                        cursor = (BNode<String>) g.root();
                    }
                    if (cmd.charAt(0) == 'l') {
                        String entry = s.next();
                        if (g.size() > 0) g.addLeft(cursor, entry);
                        else g.addRoot(entry);
                    }
                    if (cmd.charAt(0) == 'r') {
                        String entry = s.next();
                        if (g.size() > 0) g.addRight(cursor, entry);
                        else g.addRoot(entry);
                    }
                    if (cmd.charAt(0) == '.') cursor = (BNode<String>) g.root();
                    if (cmd.charAt(0) == '>') cursor = cursor.getRight();
                    if (cmd.charAt(0) == '<') cursor = cursor.getLeft();
                    if (cmd.charAt(0) == '^') cursor = (BNode<String>) cursor;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            s.close();
        }
    }
