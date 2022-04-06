public class Calculator {
    public double multiply(double a, double b) {
        return a * b;
    }

    public double powerOf(double a, double b) {
        double answer;

        if (b == 0) {
            answer = 1d;
        }
        else {
            answer = a;
            for (int i = 1; i < b; i++) {
                answer *= a;
            }
        }
        return answer;
    }
}
