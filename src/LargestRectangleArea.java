import java.util.Stack;

class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        if (heights == null)
            return 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < heights.length - 1; i++) {
            int difference = heights[i] - heights[i - 1];
            int current = heights[i] - difference;
            int area = current * 2;
            if (stack.isEmpty()) {
                stack.push(heights[i - 1]);
            }
            if (area > heights[i] && area > stack.peek()) {
                stack.pop();
                stack.push(area);
            } else if (heights[i] > heights[stack.peek()]) {
                stack.pop();
                stack.push(heights[i]);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        LargestRectangleArea largestRectangleArea = new LargestRectangleArea();
        System.out.println(largestRectangleArea.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}