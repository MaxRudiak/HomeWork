package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathExtends calculator2 = new CalculatorWithMathExtends();
        double mathEx = calculator2.div(28, 5);
        double mathEx1 = calculator2.pow(mathEx, 2);
        int mathEx2 = calculator2.mul(15, 7);
        double mathEx3 = calculator2.sum(4.1, mathEx2);
        double mathEx4 = calculator2.sum(mathEx3, mathEx1);
        System.out.println(mathEx4);
    }
}
