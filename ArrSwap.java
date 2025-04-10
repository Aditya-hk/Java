import java.util.Arrays;

public class ArrSwap {
   public ArrSwap() {
   }

   public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 35, 6};
      swap(arr, 1, 3);
      System.out.println(Arrays.toString(arr));
   }

   static void swap(int[] arr, int ind1, int ind2) {
      int temp = arr[ind1];
      arr[ind1] = arr[ind2];
      arr[ind2] = temp;
   }
}