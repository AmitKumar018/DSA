package backTracking;

public class Gridways {
    public static int  gridWays(int i,int j,int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){ //boundary crossing condition
            return 0;
        }

        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n,m));
    }
}




// USING MATHEMATICAL FORMULA

// public class Gridways {

//     public static long factorial(int num) {
//         long fact = 1;
//         for (int i = 2; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }

//     public static long gridWays(int n, int m) {
//
//         return factorial(n + m - 2) / (factorial(n - 1) * factorial(m - 1));
//     }

//     public static void main(String[] args) {
//         int n = 3; // number of rows
//         int m = 3; // number of columns
//         System.out.println("Number of unique paths: " + gridWays(n, m));
//     }
// }

