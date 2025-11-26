import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String players = scanner.next();
        int teamOneCounter = 0;
        int teamTwoCounter = 0;
        for (int i = 0; i < players.length(); i++) {
            if (players.charAt(i) == '1') {
                teamOneCounter = 0;
                teamTwoCounter += 1;
                if (teamTwoCounter == 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                teamOneCounter += 1;
                teamTwoCounter = 0;
                if (teamOneCounter == 7) {
                    System.out.println("YES");

                    return;
                }
            }
        }
        System.out.println("NO");
    }
}