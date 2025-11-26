import java.util.Scanner;
public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            long number = scanner.nextLong();
            while (number % 2 == 0) {
                number /=2;
            }
            if(number >1)
                System.out.println("YEs");
            else
                System.out.println("No");
        }
    }
}
