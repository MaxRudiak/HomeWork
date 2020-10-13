package HomeWork3;

public class WithOutCalculatorMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double outCalc  = (double) 28 / 5;
        double outCalc1 = outCalc * outCalc;
        double outCalc2 = 15 * 7 + outCalc1;
        double a = 4.1;
        double outCalc3 = a + outCalc2;
        System.out.println(outCalc3);
    }
}

