import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(n);
        } else {
            int option1 = n / 10;
            int option2 = (n / 100) * 10 + (n % 10);
            System.out.println(Math.max(option1, option2));
        }
    }
}
