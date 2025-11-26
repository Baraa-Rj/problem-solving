import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] number = new int[n];
        int maxNumberOfConsecutive = 1;
        int currentConsecutive = 1;
        for (int i = 0; i < n; i++) {
            number[i] = input.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (number[i] >= number[i - 1]) {
                currentConsecutive++;
                if (currentConsecutive > maxNumberOfConsecutive) {
                    maxNumberOfConsecutive = currentConsecutive;
                }
            } else {
                currentConsecutive = 1;
            }
        }
        System.out.println(maxNumberOfConsecutive);
    }
}
