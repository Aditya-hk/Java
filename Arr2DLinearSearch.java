public class Arr2DLinearSearch
{
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3,5},
            {1,2,3,6}
        };

            System.out.println(ls(arr, 1));


            
        }

        public static boolean ls(int arr[][], int target)
        {
            int outer=-1;
            int inner=-1;

            for(int row=0;row<arr.length;row++)
            {
                for(int col=0;col<arr[row].length;col++)
                {
if(target==arr[row][col])
{
                    inner=row;
                    outer=col;
                    return true;
}
                }
            }
            return false;
        }
    }
