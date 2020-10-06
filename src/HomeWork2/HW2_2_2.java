package HomeWork2;

import java.util.Scanner;

public class HW2_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i <= size; i++) {
            if (i % 2 != 0) {
                System.out.println("Каждый второй элемент массива = " + array[i]);
            }
        }
    }
}