package twoDArray;
import java.util.*;

public class creation {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=arr.length,m=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    
}
