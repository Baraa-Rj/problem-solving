public class DivisibilityProblem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            if (firstNumber % secondNumber == 0) {
                System.out.println(0);
            } else {
                int moves = secondNumber - (firstNumber % secondNumber);
                System.out.println(moves);
            }
        }
    }
}
