
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]= {1,34,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }



    static void insertion(int[]arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
        int (j=i+1;j>0;j++)
        {
            if(arr[j]<arr[j-1])
            swap(arr, j, j-1);
            else
            break;
        }
    }
}

static void swap(int arr[], int ind1, int ind2)
    {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}