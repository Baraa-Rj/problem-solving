import java.util.Scanner;

public class MultiplyByTwoDivideBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n % 6 == 0) {
                while (n > 6) {
                    n /= 6;
                    count++;
                }
                count++;
            } else {
                while (n % 6 != 0) {
                    if (n % 3 != 0) {
                        count = -1;
                        break;
                    } else {
                        n *= 2;
                        count++;
                    }
                }
                while (n / 6 != 0) {
                    n /= 6;
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}