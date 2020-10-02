package HomeWork1;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваше имя: ");
        String name = in.nextLine();
        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
                break;
        }
        System.out.printf("Имя: %s \n", name);
        in.close();
    }
}