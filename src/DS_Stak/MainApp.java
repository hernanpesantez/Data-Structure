package DS_Stak;


public class MainApp {
    public static void main(String[] args){
        LinkedStack<String> LStack=new LinkedStack<>();

        ArrayStack<String>  ArrStack=new ArrayStack<>();



        LStack.push("N");
        LStack.push("E");
        LStack.push("V");
        LStack.push("E");
        LStack.push("R");
        LStack.push("O");
        LStack.push("D");
        LStack.push("D");
        LStack.push("O");
        LStack.push("R");
        LStack.push("E");
        LStack.push("V");
        LStack.push("E");
        LStack.push("N");


        try {
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());
            System.out.println(LStack.pop());

        }catch (Exception e ){
            e.getCause();

        }



        ArrStack.push("This is the first world in the array");
        ArrStack.push("this is the second world i  the array");

        System.out.println(ArrStack.pop());
        System.out.println(ArrStack.pop());
        System.out.println(ArrStack.size());
        System.out.println(ArrStack.pop());



    }
}
