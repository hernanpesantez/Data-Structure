package Mis;

public class RecurenceRelation {
    public static int f(int n){
        if(n<=1){
            return 0;
        }
        int a= f(n/2);
        for (int i = 0; i <n ; i++) {
            return a + f((n+1)/2);
        }

        return n;
    }


    public static int numberOfInt(int n){
        if(n<10){
            return 1;
        }
        return 1+numberOfInt(n/10);
    }
}
