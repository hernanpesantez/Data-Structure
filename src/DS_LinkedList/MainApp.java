package DS_LinkedList;

import java.util.Scanner;

public class MainApp {


    public static void main(String args[]) {


        LinkedList<Integer> L=new LinkedList<>();

        L.addHead(3);
        L.addHead(4);
        L.addHead(5);
        L.addTail(6);





        try {
                L.addHead(L.lastButOne().getData());
        }catch (Exception e){
            e.getCause();
        }

        System.out.println(L.toString());

        Node<Integer> A,B,C,D,E;
        A=B=C=D=E=null;



      //  LinkedList<String> l = new LinkedList<String>();
      //  Scanner s = new Scanner(System.in);
      //  while (true) {
      //      System.out.println(l + "  :cmds are H T R Q: ");
      //      String cmd = s.next();
      //      if (cmd.charAt(0) == 'Q')
      //          break;
      //      if (cmd.charAt(0) == 'R')
      //          try {
      //              l.removeHead();
      //          } catch (Exception e) {
      //              System.out
      //                      .println("Remove failed.  List was already empty!");
      //          }
      //      else {
      //          String entry = s.next();
      //          if (cmd.charAt(0) == 'H')
      //              l.addHead(entry);
      //          if (cmd.charAt(0) == 'T')
      //              l.addTail(entry);
      //      }
      //  }
      //  s.close();
    } //
}
