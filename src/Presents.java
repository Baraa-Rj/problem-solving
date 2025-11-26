import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int recipient = scanner.nextInt();
            map.put(recipient, i + 1);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(map.get(i) + " ");
        }
        scanner.close();
    }
}
