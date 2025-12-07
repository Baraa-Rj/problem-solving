import java.util.ArrayList;
import java.util.List;

public class SelfDividing {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        while (left <= right) {
            int number = left;
            int temp = number;
            boolean isSelfDividing = true;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || number % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
                temp /= 10;
            }

            if (isSelfDividing) {
                result.add(number);
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
