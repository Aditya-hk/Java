package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,3,2};
        selsort(arr);
        System.out.println(Arrays.toString(arr));
}


    static void selsort(int [] arr)

{
    for (int i =0; i < arr.length; i++) {
    int last= arr.length-1-i;
    int maxIndex=getmaxindex(arr, 0, last);
    swap(arr, maxIndex, last);
}
}

static int getmaxindex(int arr[],int start,int end)
{
    int max=start;
    for(int i=start;i<=end;i++){
    if(arr[max]<arr[i])
    {
        max=i;
    }
}
return max;
}
static void swap(int arr[], int ind1, int ind2)
    {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
