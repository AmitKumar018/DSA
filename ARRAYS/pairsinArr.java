package ARRAYS;

public class pairsinArr {
    public static void pairsinArray(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.println("("+ curr+","+arr[j] +")");
                tp++;
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
         int arr[]={2,3,4,5,6,7};
        pairsinArray(arr);
    }
}
