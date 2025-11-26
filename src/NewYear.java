import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();  // number of test cases
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int y = n % 2020;
            int x = n / 2020;
            if (y <= x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
