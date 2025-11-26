import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> letters = new HashSet<>();
        int n = input.nextInt();
        String sentence = input.next().toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters.add(String.valueOf(ch));
            }
        }
        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
