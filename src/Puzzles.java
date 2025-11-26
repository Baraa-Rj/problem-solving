import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] f = new int[m];
        for (int i = 0; i < m; i++) {
            f[i] = scanner.nextInt();
        }
        Arrays.sort(f);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m-n; i++) {
            int diff = f[n + i - 1] - f[i];
            if (diff < min)
                min = diff;
        }
        System.out.println(min);
    }
}