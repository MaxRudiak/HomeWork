package HomeWork1;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваше имя: ");
        String name = in.nextLine();
        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
            if (name.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а Вы кто?");
            }
        }
        System.out.printf("Имя: %s \n", name);
        in.close();
    }
}
