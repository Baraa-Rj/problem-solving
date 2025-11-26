import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cubesInEachColumn = new int[n];
        for (int i = 0; i < n; i++) {
            cubesInEachColumn[i] = scanner.nextInt();
        }
        Arrays.sort(cubesInEachColumn);
        for (int num : cubesInEachColumn) {
            System.out.print(num + " ");
        }

    }
}