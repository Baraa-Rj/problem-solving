import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMagnets = scanner.nextInt();
        if (numberOfMagnets == 1) {
            System.out.println(1);
            return;
        }
        int groups = 0;
        String[] magnets = new String[numberOfMagnets];
        magnets[0] = scanner.next();
        for (int i = 1; i < numberOfMagnets; i++) {
            String magnet = scanner.next();
            char[] chars = magnet.toCharArray();
            if (magnets[i - 1].charAt(magnets[i - 1].length() - 1) == chars[0])
                groups++;
            magnets[i] = magnet;
        }
        groups++;
        scanner.close();
        System.out.println(groups);
    }
}
