package recvsiter;

public class Main {
    public static int fibRec(int n){
        if(n < 3){
            return 1;
        }
        return fibRec(n-2)+fibRec(n-1);

    }

    private static int fibInter(int n){
       int x = 1;
       int z = 1;

        for(int i = 3; i <= n; i++){
           int y = z;
           z = x+z;
           x = y;


        }

        return z;

    }

    public static void main(String[] args) {
        System.out.println(fibRec(6));
        System.out.println(fibInter(6));
    }
}
