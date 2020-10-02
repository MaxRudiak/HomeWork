package HomeWork1;

import java.util.Scanner;

public class Task5_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваше имя: ");
        String name = in.nextLine(); //  final String friendName1 = "Иван",
                                    // final String girlName2 = "Анастасия"
        if (name.equals("Вася")) { //name.equals (name1)
                                  // смотреть видео 26.09 1.40 про boolean
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");}
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");}
        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            System.out.println("Добрый день, а Вы кто!?");}
        System.out.printf("Имя: %s \n", name);
        in.close();
    }
}
