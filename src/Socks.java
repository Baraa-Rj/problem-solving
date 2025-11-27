import java.util.Scanner;

public class Socks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count =0;
        while(n > 0){
            count++;
            n--;
            if(count%m == 0){
                n+=1;
            }
        }
        System.out.println(count);
    }
}