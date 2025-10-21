package Recursion;

public class tillingWays {
    // non-optimize
    public static int tillingprob(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // vertical
        // int fnm1=tillingprob(n-1);

        // horizontal
        // int fnm2=tillingprob(n-2);

        // int totalWays=fnm1+fnm2;
        // return totalWays;


        // another way to write
        return tillingprob(n-1)+tillingprob(n-2);

    }
    public static void main(String[] args) {
        System.out.println(tillingprob(5));
    }
}

// same code for 4*1 also.
