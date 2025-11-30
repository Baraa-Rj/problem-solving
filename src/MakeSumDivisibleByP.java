import java.util.HashMap;

public class MakeSumDivisibleByP {
    public int minSubarray(int[] nums, int p) {
        if (nums == null)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % p == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int mod = sum % p;
        if (map.containsKey(mod)) {
            return 1;
        }
        int count = 0;
        for (int key : map.keySet()) {
            int complement = p - key;
            if (map.containsKey(complement)) {
                map.remove(complement);
                map.remove(key);
                sum =0;
                for (int num : map.keySet()) {
                    sum += num;
                }
                if (sum % p == 0) {
                    return count + 2;
                }
                count++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MakeSumDivisibleByP makeSumDivisibleByP = new MakeSumDivisibleByP();
        System.out.println(makeSumDivisibleByP.minSubarray(new int[]{6,3,5,2}, 9));
    }
}
