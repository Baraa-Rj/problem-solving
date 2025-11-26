import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum == target){
                return new int []{left+1,right+1};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 3;
        Solution solution = new Solution();
        System.out.print(Arrays.toString(solution.twoSum(nums, target)));
    }
}
