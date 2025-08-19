public class MaxSubArrayUsingSlidingWindow {
    public static void main(String[] args) {
        int arr[]={10,8,4,5,16,2,1,5},k=3;
        int maxSum=0,ws=0,sum=0;
        for(int i=0;i<k;i++){
            ws=ws+arr[i];
        }
        maxSum=ws;
        for(int i=k;i<arr.length;i++)
        {
            ws=ws+arr[i]-arr[i-k];
            if(maxSum<ws){
                maxSum=ws;
            }
        }
        System.out.println(maxSum);
    }
}
