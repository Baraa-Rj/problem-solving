import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String song = input.nextLine();
        String splitSong = song.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
        System.out.println(splitSong);

    }
}
