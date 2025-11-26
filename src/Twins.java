import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int largestSum = 0;
        int minNumber = 0;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        for (int num : coins) {
            totalSum += num;
        }
        for (int i = 0; i < coins.length; i++) {
            largestSum += coins[i];
            if (largestSum > (totalSum - coins[i])) {
                minNumber = i;
            }
        }
        System.out.println(minNumber);
    }
}