import java.util.Arrays;

public class MoveAllZerosToTheEndOfAnArray {

    public static void main(String[] args)
    {
        int arr[]={10,0,5,8,0,4,9,0,1,0};
        int i=0,j=0,n=arr.length;
        for( i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
            }
        }
        while(j<n)
        {
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
