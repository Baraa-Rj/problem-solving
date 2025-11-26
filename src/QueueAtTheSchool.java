import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        char[] chars = scanner.next().toCharArray();

        for (int step = 0; step < t; step++) {
            for (int i = 0; i < n - 1; i++) {
                if (chars[i] == 'B' && chars[i + 1] == 'G') {
                    char temp = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = temp;
                    i++; // skip next position after swap
                }
            }
        }

        System.out.println(new String(chars));
        scanner.close();
    }
}