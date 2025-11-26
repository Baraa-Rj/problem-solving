import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long odds = (n + 1) / 2;
        long ans = (k <= odds) ? (2 * k - 1) : (2 * (k - odds));
        System.out.println(ans);
    }
}
