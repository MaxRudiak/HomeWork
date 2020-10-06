package HomeWork2;

import java.util.Scanner;

public class HW2_1_2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x);
        int x1 = 0;
        while (x > 0) {
            x1 = x1 * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(x1);
        int mul = 1;
        while (x1 > 0) {
          int i = x1 % 10;
          mul *= i;
          x1 /= 10;
            if (i < x1) {
                System.out.print(i + " " + "*" + " ");
            } else {
                System.out.println(i + " " + "=" + " " + mul);
            }
        }
    }
}