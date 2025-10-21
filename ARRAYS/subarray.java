package ARRAYS;

public class subarray {
    public static void totalSubarry(int arr[]){
        int n= arr.length;
        int ts=0;
        for(int  i=0; i<n; i++){
            int start=i;
            for(int j=i; j<n; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            } 
            System.out.println();
        }
        System.out.println("total subarrays : "+ts);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        totalSubarry(arr);
    }
}
