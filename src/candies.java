import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int k = 2; k <= 30; k++) {
                int d = (1 << k) - 1; // 2^k - 1
                if (n % d == 0) {
                    System.out.println(n / d);
                    break;
                }
            }
        }
    }
}
