// java
import java.util.HashMap;
import java.util.Arrays;

public class findCommon {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> presentIn2 = new HashMap<>();
        for (int v : nums2) presentIn2.put(v, true);

        int answer1 = 0;
        for (int v : nums1) if (presentIn2.containsKey(v)) answer1++;

        HashMap<Integer, Boolean> presentIn1 = new HashMap<>();
        for (int v : nums1) presentIn1.put(v, true);

        int answer2 = 0;
        for (int v : nums2) if (presentIn1.containsKey(v)) answer2++;

        return new int[] { answer1, answer2 };
    }

    public static void main(String[] args) {
        findCommon fc = new findCommon();
        System.out.println(Arrays.toString(fc.findIntersectionValues(new int[]{2,3,2}, new int[]{1, 2}))); // [2,1]
    }
}
