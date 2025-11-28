import java.util.HashSet;

public  class LongestConsecutiveSubsequnce {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;
        System.out.println(set);
        for (int n : set) {
            // Only start counting if n is the beginning of a sequence
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > longest) {
                    longest = length;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        LongestConsecutiveSubsequnce longestConsecutiveSubsequnce = new LongestConsecutiveSubsequnce();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutiveSubsequnce.longestConsecutive(nums));
    }
}