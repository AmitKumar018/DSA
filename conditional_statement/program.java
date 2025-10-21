package conditional_statement;
import java.util.*;

public class program{
    public static void main(String[] args) {
    //    int age=17;
    //    if(age>=18){
    //     System.out.println("vote");
    //    }
    //    else if(age>16 && age<20){
    //     System.out.println("cannot drive");
    //    }
    //    else{
    //     System.out.println("not vote");
    //    }

    // largest of two
        Scanner sc=new Scanner(System.in);
        // System.out.print("enter a nuber a:" );
        // int a=sc.nextInt();
        // System.out.println("the number is "+a);
        // System.out.print("enter number b:" );
        // int b=sc.nextInt();
        // System.out.println("the number is "+b);
        // if(a<b){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("a is greater");
        // }


        // ODD EVEN
        // if(a%2==0){
        //     System.out.println("Even number");
        // }else{
        //     System.out.println("Odd Number");
        // }


        // INCOMETAX CALCULATOR
        // System.out.println("enter the income");
        // float income=sc.nextFloat();
        // if(income<500000){
        //     System.out.println("0 % tax");
        // }
        // else if(income>500000 && income<1000000){
        //     float tax=(income*20)/100;
        //     System.out.println("tax is:"+tax);
        //     System.out.println("income after paying tax: "+(income-tax));
        // }
        // else if(income>1000000){
        //     float tax=(income*30)/100;
        //     System.out.println("tax is"+tax);
        //     System.out.println("income after paying the taxes: "+(income-tax));
        // }

        // TERNARY OPERATOR
        // System.out.println("enter the marks for the student: ");
        // int marks=sc.nextInt();
        // String reportcard=marks>=33? "pass":"fail";
        // System.out.println(reportcard);

        // CALCULATOR USING SWITCH
        System.out.print("enter number1:" );
        int number1=sc.nextInt();
        System.out.println("the number is "+number1);
        System.out.print("enter number2:" );
        int number2=sc.nextInt();
        System.out.println("the number is "+number2);
        System.out.print("enter the operator: ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(number1+number2);
                    break;
            case '-':System.out.println(number1-number2);
                    break;
            case '*':System.out.println(number1*number2);
                    break;
            case '/':System.out.println(number1/number2);
                    break;
            case '%':System.out.println(number1%number2);
                     break;
            default:System.out.println("invalid operator");
        }


    }
}