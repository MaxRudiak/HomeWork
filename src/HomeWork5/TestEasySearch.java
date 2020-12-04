package HomeWork5;

import java.io.File;

public class TestEasySearch {
    public static void main(String[] args) {
        Book book = new Book();
        book.setSeparator(File.separator);
        String separator = book.getSeparator();
        book.setMyFilePath("HomeWork" + separator + "resources" + separator + "ВиМ.txt");
        String myFilePath = book.getMyFilePath();
        String text = book.readAllBytesJava7(myFilePath);

        EasySearch easySearch = new EasySearch();
        long counter1 = easySearch.search(text.toLowerCase(), "война");
        long counter2 = easySearch.search(text.toLowerCase(), "и");
        long counter3 = easySearch.search(text.toLowerCase(), "мир");
        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
    }
}
