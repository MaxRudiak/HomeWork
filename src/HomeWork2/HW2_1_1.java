package HomeWork2;

import java.util.Scanner;

public class HW2_1_1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int mul = 1;
        int i;
        for (i = 1; i <= x; i++) {
            mul *= i;
            if (i < x){
                System.out.print(i + " " + "*" + " ");
            } else {
                System.out.println(x + " " + "=" + " " + mul);
            }
        }
    }
}
