public class Main {
    private static final int[][] TEST_CASES = {
            { 1, 1 },
            { 98, 49 },
            { 2, 81 },
            { 3, 7 },
            { 19, 87 },
            { 1, 40 }
    };

    private static final int[] TEST_CASES_RESULTS = {
            1,
            98,
            162,
            21,
            1653,
            40
    };

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("TEST" + (i+1) + " " + solution(TEST_CASES[i][0], TEST_CASES[i][1]) + " : " + TEST_CASES_RESULTS[i]);
        }
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }

    public static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    private static int solution(int first, int second) {
        return lcm(first, second);
    }

}