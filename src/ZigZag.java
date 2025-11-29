public class ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] builder = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builder[i] = new StringBuilder();
        }
        boolean goingDown = false;
        int row = 0;
        for (char c : s.toCharArray()) {
            builder[row].append(c);
            if (row == 0 || row == (numRows - 1)) {
                goingDown = !goingDown;
            }
            if (goingDown) {
                row += 1;
            } else {
                row -= 1;
            }
        }
        StringBuilder build = new StringBuilder();
        for (StringBuilder b : builder) {
            build.append(b);
        }
        return build.toString();
    }
}
