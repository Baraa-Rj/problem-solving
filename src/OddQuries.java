import java.util.Scanner;

public class OddQuries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += array[j];
            }
            for (int j = 0; j < q; j++) {
                int r = scanner.nextInt();
                int l = scanner.nextInt();
                int k = scanner.nextInt();
                int oldSegment = (array[r - 1] + array[l - 1]) % 2;
                int newSegment = ((r - l + 1) * k) % 2;
                int sumParity = sum % 2;
                int totalParity = (oldSegment + newSegment + sumParity) % 2;
                if (totalParity == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
