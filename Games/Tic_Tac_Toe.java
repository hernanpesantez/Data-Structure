/**
 * Created by hernanpesantez on 3/30/17.
 */

import java.util.*;
public class Tic_Tac_Toe {
    private String[] Move;
    private String userXO;
    private String AI_XO;
    private boolean user_winner;
    private boolean AI_winner;

    public Tic_Tac_Toe() {

        Move = new String[9];
        for (int i = 0; i < Move.length; i++) {

            Move[i] = String.valueOf(i);
        }

    }

    public String[] getM() {
        return Move;
    }

    public String getXO() {
        return userXO;
    }

    public void setM(String[] m) {
        Move = m;
    }

    public void setXO(String XO) {
        this.userXO = XO;
    }

    public String getAI_XO() {
        return AI_XO;
    }

    public void setAI_XO(String AI_XO) {
        this.AI_XO = AI_XO;
    }

    public String getUserXO() {
        return userXO;
    }

    public void setUserXO(String userXO) {
        this.userXO = userXO;
    }


    public void instructions() {
        System.out.print(
                "The object of Tic Tac Toe is to get three in a row.\n" +
                        "You play on a three by three game board.\n" +
                        "The first player is known as X and the second is O.\n" +
                        "Players alternate placing Xs and Os on the game board until\n" +
                        "either opponent has three in a row or all nine squares are filled.\n\n");

    }

    public void board() {

        System.out.println("::======:========:=======::");
        System.out.println("||  " + Move[0] + "   |   " + Move[1] + "    |   " + Move[2] + "   ||");
        System.out.println("::------|--------|-------::");
        System.out.println("||  " + Move[3] + "   |   " + Move[4] + "    |   " + Move[5] + "   ||");
        System.out.println("::------|--------|-------::");
        System.out.println("||  " + Move[6] + "   |   " + Move[7] + "    |   " + Move[8] + "   ||");
        System.out.println("::======:========:=======::");
        System.out.print("\n");

    }

    public void reset() {
        for (int i = 0; i < Move.length; i++) {
            Move[i] = " ";
        }

    }

    public void selectXO() {

        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to be X or O?:");
        String x;

        x = in.nextLine();

        if (x.equals("X") || x.equals("x")) {
            userXO = "X";
            AI_XO = "O";
        } else if (x.equals("O") || x.equals("o")) {
            userXO = "O";
            AI_XO = "X";
        } else {

            do {
                System.out.println("PLease enter X or O:");
                x = in.nextLine();
                if (x.equals("X") || x.equals("x")) {
                    userXO = "X";
                    AI_XO = "O";
                    break;
                } else if (x.equals("O") || x.equals("o")) {
                    userXO = "O";
                    AI_XO = "X";
                    break;
                }
            }
            while (x != "X" || x != "x" || x != "O" || x != "o");


        }

    }


    public void set(int move, String XO) {

        Move[move] = XO;

    }

    public void computerMove() {


        // computer best move
        if (Move[0] == AI_XO && Move[1] == AI_XO && Move[2] != userXO) {
            set(2, AI_XO);
            //AI_winner=true;
        }
        //first row
        else if (Move[2] == AI_XO && Move[1] == AI_XO && Move[0] != userXO) {
            set(0, AI_XO);
            //AI_winner=true;
        } else if (Move[0] == AI_XO && Move[2] == AI_XO && Move[1] != userXO) {
            set(1, AI_XO);
            //AI_winner=true;
        }

        //second row
        else if (Move[3] == AI_XO && Move[4] == AI_XO && Move[5] != userXO) {
            set(5, AI_XO);
            //AI_winner=true;
        } else if (Move[5] == AI_XO && Move[4] == AI_XO && Move[3] != userXO) {
            set(3, AI_XO);
            //AI_winner=true;
        } else if (Move[3] == AI_XO && Move[5] == AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
            //AI_winner=true;
        }
        //third row
        else if (Move[6] == AI_XO && Move[7] == AI_XO && Move[8] != userXO) {
            set(8, AI_XO);
            //AI_winner=true;
        } else if (Move[8] == AI_XO && Move[7] == AI_XO && Move[6] != userXO) {
            set(6, AI_XO);
            //AI_winner=true;
        } else if (Move[6] == AI_XO && Move[8] == AI_XO && Move[7] != userXO) {
            set(7, AI_XO);
            //AI_winner=true;
        }

        //first column
        else if (Move[0] == AI_XO && Move[3] == AI_XO && Move[6] != userXO) {
            set(6, AI_XO);
            //AI_winner=true;
        } else if (Move[6] == AI_XO && Move[3] == AI_XO && Move[0] != userXO) {
            set(0, AI_XO);
            //AI_winner=true;
        } else if (Move[0] == AI_XO && Move[6] == AI_XO && Move[3] != userXO) {
            set(3, AI_XO);
            //AI_winner=true;
        }


        //second column
        else if (Move[1] == AI_XO && Move[4] == AI_XO && Move[7] != userXO) {
            set(7, AI_XO);
            //AI_winner=true;
        } else if (Move[7] == AI_XO && Move[4] == AI_XO && Move[1] != userXO) {
            set(1, AI_XO);
            //AI_winner=true;
        } else if (Move[1] == AI_XO && Move[7] == AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
            //AI_winner=true;
        }

        //third column
        else if (Move[2] == AI_XO && Move[5] == AI_XO && Move[8] != userXO) {
            set(8, AI_XO);
            //AI_winner=true;
        } else if (Move[8] == AI_XO && Move[5] == AI_XO && Move[2] != userXO) {
            set(2, AI_XO);
            //AI_winner=true;
        } else if (Move[8] == AI_XO && Move[2] == AI_XO && Move[5] != userXO) {
            set(5, AI_XO);
            //AI_winner=true;
        }

        //first cruz
        else if (Move[0] == AI_XO && Move[4] == AI_XO && Move[8] != userXO) {
            set(8, AI_XO);
            //AI_winner=true;
        } else if (Move[4] == AI_XO && Move[8] == AI_XO && Move[0] != userXO) {
            set(0, AI_XO);
            //AI_winner=true;
        } else if (Move[0] == AI_XO && Move[8] == AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
            //AI_winner=true;
        }

        //second cruz
        else if (Move[2] == AI_XO && Move[4] == AI_XO && Move[6] != userXO) {
            set(6, AI_XO);
            //AI_winner=true;
        } else if (Move[6] == AI_XO && Move[4] == AI_XO && Move[2] != userXO) {
            set(2, AI_XO);
            //AI_winner=true;
        } else if (Move[2] == AI_XO && Move[6] == AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
            //AI_winner=true;
        }
        //end


        else if (Move[0] == userXO && Move[1] == userXO && (Move[2] != AI_XO && Move[2] != userXO)) {
            set(2, AI_XO);
        } else if (Move[2] == userXO && Move[1] == userXO && (Move[0] != AI_XO && Move[0] != userXO)) {
            set(0, AI_XO);
        } else if (Move[2] == userXO && Move[0] == userXO && (Move[1] != AI_XO && Move[1] != userXO)) {
            set(1, AI_XO);
        }
        //

        else if (Move[3] == userXO && Move[4] == userXO && (Move[5] != AI_XO && Move[5] != userXO)) {
            set(5, AI_XO);
        } else if (Move[4] == userXO && Move[5] == userXO && (Move[3] != AI_XO && Move[3] != userXO)) {
            set(3, AI_XO);
        } else if (Move[3] == userXO && Move[5] == userXO && (Move[4] != AI_XO && Move[4] != userXO)) {
            set(4, AI_XO);

        }
        ///
        else if (Move[6] == userXO && Move[7] == userXO && (Move[8] != AI_XO && Move[8] != userXO)) {
            set(8, AI_XO);
        } else if (Move[7] == userXO && Move[8] == userXO && (Move[6] != AI_XO && Move[6] != userXO)) {
            set(6, AI_XO);
        } else if (Move[8] == userXO && Move[6] == userXO && (Move[7] != AI_XO && Move[7] != userXO)) {
            set(7, AI_XO);
        }
        //
        else if (Move[0] == userXO && Move[3] == userXO && (Move[6] != AI_XO && Move[6] != userXO)) {
            set(6, AI_XO);
        } else if (Move[6] == userXO && Move[3] == userXO && Move[0] != AI_XO && Move[0] != userXO) {
            set(0, AI_XO);
        } else if (Move[0] == userXO && Move[6] == userXO && Move[3] != AI_XO && Move[3] != userXO) {
            set(3, AI_XO);
        }

        //
        else if (Move[7] == userXO && Move[4] == userXO && Move[1] != AI_XO && Move[1] != userXO) {
            set(1, AI_XO);
        } else if (Move[7] == userXO && Move[1] == userXO && Move[4] != AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
        } else if (Move[1] == userXO && Move[4] == userXO && Move[7] != AI_XO && Move[7] != userXO) {
            set(7, AI_XO);
        }


        //
        else if (Move[2] == userXO && Move[5] == userXO && Move[8] != AI_XO && Move[8] != userXO) {
            set(8, AI_XO);
        } else if (Move[8] == userXO && Move[5] == userXO && Move[2] != AI_XO && Move[2] != userXO) {
            set(2, AI_XO);
        } else if (Move[8] == userXO && Move[2] == userXO && Move[5] != AI_XO && Move[5] != userXO) {
            set(5, AI_XO);
        }


        //
        else if (Move[0] == userXO && Move[4] == userXO && Move[8] != AI_XO && Move[8] != userXO) {
            set(8, AI_XO);
        } else if (Move[8] == userXO && Move[4] == userXO && Move[0] != AI_XO && Move[0] != userXO) {
            set(0, AI_XO);
        } else if (Move[0] == userXO && Move[8] == userXO && Move[4] != AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
        }

        //
        else if (Move[2] == userXO && Move[4] == userXO && Move[6] != AI_XO && Move[6] != userXO) {
            set(6, AI_XO);
        } else if (Move[6] == userXO && Move[4] == userXO && Move[2] != AI_XO && Move[2] != userXO) {
            set(2, AI_XO);

        } else if (Move[2] == userXO && Move[6] == userXO && Move[4] != AI_XO && Move[4] != userXO) {
            set(4, AI_XO);
        } else if (AI_XO != " " && checkIfboardIsFull()) {

            AI_XO = " ";
        } else {

            Random rand = new Random();
            int x = rand.nextInt(7) + 1;


            if (Move[x] == AI_XO || Move[x] == userXO || checkIfboardIsFull()) {
                do {
                    x = rand.nextInt(7) + 1;

                }
                while (Move[x] == AI_XO || Move[x] == userXO || checkIfboardIsFull());
                set(x, AI_XO);
            } else if (checkIfboardIsFull()) {
                AI_winner = false;
                user_winner = false;
            } else {

                set(x, AI_XO);

            }
        }

    }

    public void userMove() {
        System.out.print("Please select move for " + "\'" + userXO + "\'" + ":");

        int U = userInput();

        if (Move[U] == userXO || Move[U] == AI_XO) {
            while (Move[U] == userXO || Move[U] == AI_XO) {
                System.out.println("Move not available ");
                System.out.println("Please select another move: ");
                U = userInput();
            }
            set(U, userXO);
        } else {
            set(U, userXO);
        }
    }

    public int userInput() {


        int in;
        Scanner input = new Scanner(System.in);

        in = input.nextInt();
        while(in<0||in>8) {
            System.out.println("Please enter a number from 0-8:");
            in = input.nextInt();
        }
        return in;
    }


    public void checkForWinner(){
        user_winner =false;
        AI_winner =false;

        if(Move[0]==userXO&&Move[1]==userXO&&Move[2]==userXO){
            user_winner=true;
            reset();
            set(0,userXO);
            set(1,userXO);
            set(2,userXO);
        }
        else if(Move[3]==userXO&&Move[4]==userXO&&Move[5]==userXO){
            reset();
            set(3,userXO);
            set(4,userXO);
            set(5,userXO);
            user_winner=true;
        }
        else if(Move[6]==userXO&&Move[7]==userXO&&Move[8]==userXO){
            reset();
            set(6,userXO);
            set(7,userXO);
            set(8,userXO);
            user_winner=true;
        }
        else if(Move[0]==userXO&&Move[4]==userXO&&Move[8]==userXO){
            reset();
            set(0,userXO);
            set(4,userXO);
            set(8,userXO);
            user_winner=true;
        }
        else if(Move[2]==userXO&&Move[4]==userXO&&Move[6]==userXO){
            reset();
            set(2,userXO);
            set(4,userXO);
            set(6,userXO);
            user_winner=true;
        }
        else if(Move[2]==userXO&&Move[5]==userXO&&Move[8]==userXO){
            reset();
            set(2,userXO);
            set(5,userXO);
            set(8,userXO);
            user_winner=true;
        }
        else if(Move[1]==userXO&&Move[4]==userXO&&Move[7]==userXO){
            reset();
            set(1,userXO);
            set(4,userXO);
            set(7,userXO);
            user_winner=true;
        }



        //

        else if(Move[0]== AI_XO &&Move[1]== AI_XO &&Move[2]== AI_XO){
            reset();
            set(0, AI_XO);
            set(1, AI_XO);
            set(2, AI_XO);
            AI_winner =true;
        }
        else if(Move[3]== AI_XO &&Move[4]== AI_XO &&Move[5]== AI_XO){
            reset();
            set(3, AI_XO);
            set(4, AI_XO);
            set(5, AI_XO);
            AI_winner =true;
        }
        else if(Move[6]== AI_XO &&Move[7]== AI_XO &&Move[8]== AI_XO){
            reset();
            set(6, AI_XO);
            set(7, AI_XO);
            set(8, AI_XO);
            AI_winner =true;
        }
        else if(Move[0]== AI_XO &&Move[4]== AI_XO &&Move[8]== AI_XO){
            reset();
            set(0, AI_XO);
            set(4, AI_XO);
            set(8, AI_XO);
            AI_winner =true;
        }
        else if(Move[2]== AI_XO &&Move[4]== AI_XO &&Move[6]== AI_XO){
            reset();
            set(2, AI_XO);
            set(4, AI_XO);
            set(6, AI_XO);
            AI_winner =true;
        }
        else if(Move[2]== AI_XO &&Move[5]== AI_XO &&Move[8]== AI_XO){
            reset();
            set(2, AI_XO);
            set(5, AI_XO);
            set(8, AI_XO);
            AI_winner =true;
        }
        else if(Move[1]== AI_XO &&Move[4]== AI_XO &&Move[7]== AI_XO){
            reset();
            set(1, AI_XO);
            set(4, AI_XO);
            set(7, AI_XO);
            AI_winner =true;
        }
        else if(Move[0]== AI_XO &&Move[3]== AI_XO &&Move[6]== AI_XO){
            reset();
            set(0, AI_XO);
            set(3, AI_XO);
            set(6, AI_XO);
            AI_winner =true;
        }
    }
    public void user_computer_move() {

        instructions();
        selectXO();
        board();
        reset();

        for (int i = 0; i < Move.length; i++) {


            if (userXO == "X") {
                if (user_winner) {
                    System.out.println("\'" + userXO + "\'" + " IS THE WINNER!");
                    System.out.println("YOU WON!");
                    board();
                    break;
                }
                if (AI_winner) {
                    System.out.println("\'" + AI_XO + "\'" + " IS THE WINNER!");
                    System.out.println("COMPUTER WON!");
                    board();
                    break;
                }
                if (checkIfboardIsFull()) {
                    System.out.print("DRAW!");

                    break;
                }
                if (!checkIfboardIsFull() && !user_winner && !AI_winner) {
                    userMove();
                    computerMove();
                    board();
                    checkForWinner();
                }
            } else {

                computerMove();
                board();
                checkForWinner();

                if (user_winner) {
                    System.out.println("\'" + userXO + "\'" + " IS THE WINNER!");
                    System.out.println("YOU WON!");
                    board();
                    break;
                }
                if (AI_winner) {
                    System.out.println("\'" + AI_XO + "\'" + " IS THE WINNER!");
                    System.out.println("COMPUTER WON!");
                    board();
                    break;
                }
                if (checkIfboardIsFull()) {
                    System.out.println("DRAW!");
                    board();
                    break;
                }
                if (!checkIfboardIsFull() && !user_winner && !AI_winner) {

                    userMove();


                }
            }
        }

    }

    public boolean checkIfboardIsFull() {
        boolean c = true;

        for (int i = 0; i < Move.length; i++) {

            if (Move[i]==" "){
                c=false;
            }
        }
        return c;
    }




    public static void main(String[] args){


        Scanner in=new Scanner(System.in);
        String answer=null;
        Tic_Tac_Toe T = new Tic_Tac_Toe();

        try {
            T.user_computer_move();
            //answer=in.nextLine();

        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("Invalid input...");


        }


    }


}
