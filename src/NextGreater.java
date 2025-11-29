import java.util.Arrays;
import java.util.Stack;

class NextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
                if (found) {
                    while (!stack.isEmpty()) {
                        int prev = stack.peek();
                        if (nums2[prev] < nums2[j]) {
                            result[i] = nums2[j];
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                    stack.push(j);
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreater nextGreater = new NextGreater();
        System.out.println(Arrays.toString(nextGreater.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
    }
}