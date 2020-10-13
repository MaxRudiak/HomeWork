package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double withOp = calculator.div(28, 5);
        double withOp1 = calculator.pow(withOp, 2);
        int withOp2 = calculator.mul(15, 7);
        double withOp3 = calculator.sum(4.1, withOp2);
        double withOp4 = calculator.sum(withOp3, withOp1);
        System.out.println(withOp4);
    }
}

