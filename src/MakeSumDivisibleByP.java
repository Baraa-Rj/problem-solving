import java.util.HashMap;

class MakeSumDivisibleByP {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int x : nums) total += x;
        int r = (int) (total % p);
        if (r == 0) return 0;

        HashMap<Integer, Integer> last = new HashMap<>();
        last.put(0, -1);
        int prefix = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            int need = (prefix - r + p) % p;
            if (last.containsKey(need)) {
                minLen = Math.min(minLen, i - last.get(need));
            }
            last.put(prefix, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }

}