package HomeWork5;

import java.io.File;

public class TestRegExSearch {
    public static void main(String[] args) {
        Book book = new Book();
        book.setSeparator(File.separator);
        String separator = book.getSeparator();
        book.setMyFilePath("HomeWork" + separator + "resources" + separator + "ВиМ.txt");
        String myFilePath = book.getMyFilePath();
        String text = book.readAllBytesJava7(myFilePath);

        RegExSearch regExSearch = new RegExSearch();
        long counter1 =  regExSearch.search(text.toLowerCase(),"война");
        long counter2 =  regExSearch.search(text.toLowerCase(),"и");
        long counter3 =  regExSearch.search(text.toLowerCase(),"мир");
        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
    }
}
