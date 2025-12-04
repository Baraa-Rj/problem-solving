class Pivot {
    public int pivotInteger(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return -1;
        }
        int halfSum = sum / 2;
        int mySum = 0;
        int i = 1;
        while (mySum < halfSum) {
            mySum += i;
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        Pivot pivot = new Pivot();
        System.out.println(pivot.pivotInteger(1));
    }
}