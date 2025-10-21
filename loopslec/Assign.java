package loopslec;
import java.util.*;


public class Assign {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
//         int number;
//         int choice;
//         int evenSum=0;
//         int oddSum=0;
// // print even and odd  sum
//         do{
//             System.out.println("Enter a number");
//             number=sc.nextInt();
//             if(number%2==0){
//                 evenSum+=number;
//             }else{
//                 oddSum+=number;
//             }
//            System.out.println("do you want to continue press 1 or o for break");
//            choice=sc.nextInt();
//         }while(choice==1);

//         System.out.println("sum of even number: "+evenSum);
//         System.out.println("sum of odd number: "+oddSum);


// FACTORIAL
    //     System.out.println("enter a positive number:");
    //     int fact=1;
    //     int n=sc.nextInt();
    //     for(int i=1;i<=n; i++){
    //         fact*=i;
    //     }
    //     System.out.println("factorial: "+fact);

    // TABLE OF NUMBER
    System.out.println("enter a number:" );
    int n=sc.nextInt();
    int table=0;
    
    for(int i=1;i<=10;i++){
        table=n*i;
        System.out.println(table);
    }
    
   
   
       
      }

    
}
