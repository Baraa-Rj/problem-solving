import java.util.Arrays;
import java.util.Stack;
class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()) {
                if (temperatures[i] > temperatures[stack.peek()]) {
                    result[stack.peek()] = Math.abs(stack.peek() - i);
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        DailyTemp dailyTemp = new DailyTemp();
        System.out.println(Arrays.toString(dailyTemp.dailyTemperatures(new int[]{30, 60,90})));
    }
}