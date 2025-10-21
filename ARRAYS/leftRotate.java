package ARRAYS;

public class leftRotate {
    public static void left(int arr[]){
        int n=arr.length;
        int temp=arr[0];
        for(int i=0; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        left(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
