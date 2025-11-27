import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextInt();
            }

            // If all marbles equal Alice, pick any number
            boolean allEqual = true;
            for (int i = 0; i < n; i++) {
                if (v[i] != a) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                System.out.println(1); // any valid number
                continue;
            }

            int bestB = 0;
            int maxPoints = -1;

            // Check candidate B between each marble and Alice
            for (int i = 0; i < n; i++) {
                int candidateB;
                if (v[i] == a) continue;

                // candidate midpoint to beat Alice for marble v[i]
                if (v[i] < a) candidateB = v[i] - (a - v[i]) / 2 - 1;
                else candidateB = v[i] - (v[i] - a) / 2;

                int points = 0;
                for (int j = 0; j < n; j++) {
                    if (Math.abs(v[j] - candidateB) < Math.abs(v[j] - a)) {
                        points++;
                    }
                }

                if (points > maxPoints) {
                    maxPoints = points;
                    bestB = candidateB;
                }
            }

            System.out.println(bestB);
        }
    }
}
