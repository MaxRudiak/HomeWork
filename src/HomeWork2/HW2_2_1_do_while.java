package HomeWork2;

import java.util.Scanner;

public class HW2_2_1_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        int i = 0;
        do {
            array[i] = sc.nextInt();
            i++;
        } while (i < size);
        System.out.println("Массив: ");
        int j = 0;
        do {
            System.out.println(" " + array[j]);
            j++;
        } while (j < size);
    }
}
