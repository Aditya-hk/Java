

public class ArrMax {
    public static void main(String[] args) {
        int arr[] = {1, 99, 5, 666, 7};
        int ans = Max(arr);
        System.out.println(ans);
    }

    static int Max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            return max ;

        }

    }

