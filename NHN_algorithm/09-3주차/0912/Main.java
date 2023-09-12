public class Main {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 5, 7, 13 }));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
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