class CountPartitionsWithEvenSumDifference {
    public int countPartitions(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int totalSum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            totalSum += nums[i];
        }
        return totalSum %2 == 0 ? nums.length-1 : 0;
    }

    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference countPartitionsWithEvenSumDifference = new CountPartitionsWithEvenSumDifference();
        System.out.println(countPartitionsWithEvenSumDifference.countPartitions(new int[]{10,10,3,7,6}));
    }
}