import java.util.Arrays;
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4};
        int i=0,j=0;
        for (i = 0; i < arr.length; i++) {
                if(arr[i]!=arr[j])
                {
                    j++;
                }
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        }
        for(int k=0;k<=j;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
