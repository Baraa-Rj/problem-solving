import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("I hate it");
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i != n) {
                builder.append("I hate that ");
            } else {
                builder.append("I love that");
            }
        }
        builder.append("it");
        System.out.println(builder.toString());
    }
}
