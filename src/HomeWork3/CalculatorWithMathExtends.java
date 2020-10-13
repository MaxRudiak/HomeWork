package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double pow(double d, int a) {
        if (d > 0) {
            return Math.pow(d, a);
        } else {
            return 0;
        }
    }

    @Override
    public int module(int a) {
        return Math.abs(a);
    }

    @Override
    public double rootSqrt(double a) {
        return Math.sqrt(a);
    }
}
