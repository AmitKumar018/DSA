package ARRAYS;

public class maxSubarraySum {
    public static void printSubarraysum(int arr[]){
        int n=arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int start=i;
            for(int j=i; j<n; j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if( maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxm subarray sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubarraysum(arr);

    }
}
