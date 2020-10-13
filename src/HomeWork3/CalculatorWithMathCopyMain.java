package HomeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathCopy calculator1 = new CalculatorWithMathCopy();
        double withMathCopy = calculator1.divWithMathCopy(28, 5);
        double withMathCopy1 = calculator1.powWithMathCopy(withMathCopy, 2);
        double withMathCopy2 = calculator1.mulWithMathCopy(15, 7);
        double withMathCopy3 = calculator1.sumWithMathCopy(4.1, withMathCopy2);
        double withMathCopy4 = calculator1.sumWithMathCopy(withMathCopy3, withMathCopy1);
        System.out.println(withMathCopy4);
    }
}
