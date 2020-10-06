package HomeWork2;

import java.util.Scanner;

public class HW2_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число и его степень: ");
        double n = sc.nextDouble();
        int m = sc.nextInt();
        double l;
        if (m < 0) {
            System.out.println("Вы ввели отрицательное число в степени");
        } else{
            l = 1;
            for (int i = 0; i < m; i++){
                l *= n;
            }
            System.out.println("Результат: " + l);
        }
    }
}
