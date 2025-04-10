

public class BinarySearch {
    public static void main(String[] args) {
      int arr[]={-1,-2,1,2,3,4,5,9};  // only for Ascended sorted arrays.........
      int tar=0;
      int ans= binarysearch(arr,tar);
        System.out.println(ans);
    }

   static int binarysearch(int [] arr, int num)
   {
    int start=0;
    int end= arr.length-1;
    while(start<=end)
    {
        int mid= start+(end-start)/2;
        if(num<arr[mid])
        {
            end=mid-1;

        }
        else if(num>arr[mid])
        start=mid+1;
        else
        num=arr[mid];
        return num;
    }
    return 0;
   }
}