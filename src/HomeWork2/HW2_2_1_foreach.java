package HomeWork2;

import java.util.Scanner;

public class HW2_2_1_foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i : array) {
                array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
        System.out.println("Массив: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]); /*
                                                   цикл for each не подходит для заполненения массива,
                                                   в данном случае i обозначает элемент массива, а не
                                                   индекс
                                                */
        }
    }
}
