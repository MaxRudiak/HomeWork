package HomeWork2;

import java.util.Scanner;

public class HW2_4_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

