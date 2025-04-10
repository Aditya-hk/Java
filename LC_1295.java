

public class LC_1295 {
    public static void main(String[] args) {
       int [] nums = {437};
      int ans=  findNumbers(nums);
        System.out.println(ans);
    }
//if(num>99 && num<


       static int findNumbers(int[] nums) {
           int count = 0;
            int digi=0;
            for(int i=0;i<nums.length;i++) {
                while (nums[i] > 0) {

                    digi++;
                    nums[i] /= 10;
                }


                if (digi % 2 == 0)
                    count++;
            }
            return count;


        }

    }


