package HomeWork3;

public class CalculatorWithOperator {

    public double sum(double a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int min(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return (double) a / b;
    }

    public double pow(double d, int a) {
        double result = 1;
        for (int i = 0; i < a; i++) {
            if (d > 0) {
                result = result * d;
            } else {
                return 0;
            }
        }
        return result;
    }

    public int module(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public double rootSqrt(double a) {
        return Math.sqrt(a);
    }
}



