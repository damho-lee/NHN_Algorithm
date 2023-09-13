public class Main {

    public static void main(String[] args) {
        test(TEST_CASES, TEST_CASES_RESULT);
    }

    private static void test(int[][] TEST_CASES, int[] TEST_CASES_RESULT) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("solution : " + solution(TEST_CASES[i]) + ", " + TEST_CASES_RESULT[i]);
        }
    }

    private static final int[][] TEST_CASES = {
            { 10, 20, 30, 40 },
            { 5, 7, 13 },
            { 100, 200, 300, 400 },
            { 40, 30, 20, 10 }
    };

    private static final int[] TEST_CASES_RESULT = {
            20,
            1,
            200,
            20
    };

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int solution(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int tmp = gcd(input[i], input[j]);
                if (max < tmp)
                    max = tmp;
            }
        }
        return max;
    }

}