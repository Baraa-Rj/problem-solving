class isPalindromeDigit {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        int left = 0;
        int right = value.length() - 1;
        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindromeDigit isPalindromeDigit = new isPalindromeDigit();
        System.out.println(isPalindromeDigit.isPalindrome(121));
    }
}