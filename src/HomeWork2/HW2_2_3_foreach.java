package HomeWork2;

import java.util.Scanner;

public class HW2_2_3_foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = size; i > 0; i--) {
            array[i-1] = sc.nextInt();
        }
        System.out.println("Массив: ");
        for(int i : array) {
            System.out.println(" " + i);
        }
    }
}
