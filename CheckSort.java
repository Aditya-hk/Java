

public class CheckSort {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean ans= check(arr);
        System.out.println(ans);

    }

    static boolean check(int [] arr)
    {
        int start =0;
        int end=arr.length-1;

            if(arr[start]<arr[end])
                return true;
            else
                return false;
        }
    }

