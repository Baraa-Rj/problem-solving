import java.util.HashMap;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            int value = scanner.nextInt();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (int value : map.values()) {
            if (value > 1) {
                counter += value - 1;
            }
        }
        System.out.println(counter);
    }
}
