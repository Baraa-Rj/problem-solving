import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] array;
        while (scanner.hasNextLine()) {
            int t = scanner.nextInt();
            array = new int[t - 2];
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            for (int i = 0; i < t - 2; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            for (int i = 1; i < n; i++) {
                if (array[i] - array[i - 1] > k) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
