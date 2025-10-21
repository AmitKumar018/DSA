package bitmanupulation;

public class odd_even {
    public static void oddOrEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even no");
        }else{
            System.out.println("odd no");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(4);
    }
}
