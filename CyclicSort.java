

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]={1,2,4,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        //if 0 to N then   arr[i]= actualpos
        // if 1 to N then  arr[i]-1= actualpos
    }
    static void sort(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
// ✅ Fix: Only swap if in valid range and value is not already in the correct position

            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct])
            swap(arr,i,correct);
            else
            i++;
        }
    }
    static void swap(int arr[], int ind1, int ind2)
    {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
