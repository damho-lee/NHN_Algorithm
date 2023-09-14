import java.math.BigDecimal;

public class Main {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static class Fraction {
        private int numerator; // 분자
        private int denominator; // 분모

        public Fraction(int numerator, int denominator) {
            if (denominator == 0 || numerator == 0) {
                throw new IllegalArgumentException("denominator is 0!!");
            }
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void normalize() {
            int gcd = Math.abs(gcd(this.numerator, this.denominator));
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;

        }

        @Override
        public String toString() {
            return this.getNumerator() + "/" + this.getDenominator();
        }

    }

    /**
     * 소수점 값에 대해 자리 수 계산 하는 메서드. <br/>
     * ex) <br/>
     * 0.01 -> 100을 곱하기 위해 2를 return <br/>
     * 0.1 -> 10을 곱하기 위해 1을 return
     *
     *
     * @param num 소수 값
     * @return 소수점 이하 자리 수 값
     */
    public static int getDecimalNumber(BigDecimal num) {
        String str = num.toPlainString();
        int pointIndex = str.indexOf(".");
        int decimalNumber = str.length() - pointIndex - 1;
        return decimalNumber;
    }

    public static String solution(String input) {
        BigDecimal number = new BigDecimal(input);
        int decimalNumber = getDecimalNumber(number);

        double denominator = 0;
        int numerator = 0;

        numerator = number.multiply(new BigDecimal(Math.pow(10, decimalNumber))).intValue();
        denominator = Math.pow(10, decimalNumber);

        System.out.println("numerator : " + numerator + " denominator : " +denominator);

        return new Fraction(numerator, (int) denominator).toString();
    }

    public static void main(String[] args) {
        // System.out.println(solution("0.5"));
        // System.out.println(solution("0.10"));
        // System.out.println(solution("0.15"));
        // System.out.println(solution("0.20"));
        // System.out.println(solution("0.25"));
        // System.out.println(solution("0.30"));
        // System.out.println(solution("0.35"));
        // System.out.println(solution("0.40"));
        // System.out.println(solution("0.45"));
        // System.out.println(solution("0.50"));
        // System.out.println(solution("0.55"));
        // System.out.println(solution("0.60"));
        // System.out.println(solution("0.65"));
        // System.out.println(solution("-0.2"));
        // System.out.println(solution("-0.3"));
        // System.out.println(solution("-0.4"));
        // System.out.println(solution("-0.5"));
        System.out.println(solution("0"));

    }

}