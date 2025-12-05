class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int totalSum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            totalSum += nums[i];
        }
        return totalSum %2 == 0 ? nums.length-1 : 0;
    }
    class Solution {
        public int countPartitions(int[] nums) {
            int total = 0;
            for (int num : nums) total += num;

            int leftSum = 0;
            int count = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                leftSum += nums[i];
                int rightSum = total - leftSum;

                if ((leftSum % 2) == (rightSum % 2)) {
                    count++;
                }
            }
            return count;
        }
    }


    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference countPartitionsWithEvenSumDifference = new CountPartitionsWithEvenSumDifference();
        System.out.println(countPartitionsWithEvenSumDifference.countPartitions(new int[]{10,10,3,7,6}));
    }
}