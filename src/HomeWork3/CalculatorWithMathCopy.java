package HomeWork3;

public class CalculatorWithMathCopy {

    public double sumWithMathCopy(double a, int b) {
        return a + b;
    }

    public double sumWithMathCopy(double a, double b) {
        return a + b;
    }

    public int minWithMathCopy(int a, int b) {
        return a - b;
    }

    public int mulWithMathCopy(int a, int b) {
        return a * b;
    }

    public double divWithMathCopy(int a, int b) {
        return (double) a / b;
    }

    public double powWithMathCopy(double d, int a) {
        if (d > 0) {
            return Math.pow(d, a);
        } else {
            return 0;
        }
    }

    public int moduleWithMathCopy(int a) {
        return Math.abs(a);
        }

    public double rootSqrtWithMathCopy(double a) {
        return Math.sqrt(a);
    }

}