import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = input.nextInt();
        }
        Arrays.sort(prices);
        int totalProfit = 0;
        for (int i = 0; i < m; i++) {
            if (prices[i] < 0)
                totalProfit += prices[i];
        }
        totalProfit *= -1;
        System.out.println(totalProfit);
    }
}
