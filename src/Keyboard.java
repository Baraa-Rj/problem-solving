// java
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char dir = input.next().charAt(0);
        String str = input.next();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            int idx = str.indexOf(c);
            if (idx == -1) {
                continue;
            }
            if (dir == 'R') {
                sb.append(str.charAt(idx - 1));
            } else { // assume 'L'
                sb.append(str.charAt(idx + 1));
            }
        }

        System.out.println(sb.toString());
    }
}
