package array;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[count] != nums[index]) {
                count++;
                nums[count] = nums[index];
            }
        }
        for (int i: nums) {
            System.out.println(i);
        }
        return count + 1;
    }
}
