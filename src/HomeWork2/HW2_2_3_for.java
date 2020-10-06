package HomeWork2;

import java.util.Scanner;

public class HW2_2_3_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Массив: ");
        for(int i = size - 1; i >= 0; i--) {
            System.out.println(" " + array[i]);
        }
    }
}
