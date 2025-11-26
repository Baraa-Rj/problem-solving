import java.util.HashSet;
import java.util.Scanner;

public class Win {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int levels = sc.nextInt();
        int p = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < p; i++) {
            set.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            set.add(sc.nextInt());
        }
        if (set.size() == levels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}