package HomeWork5;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * класс, чтоб посмотрет, как будет работать
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setSeparator(File.separator);
        String separator = book.getSeparator();
        book.setMyFilePath("HomeWork" + separator + "resources" + separator + "ВиМ.txt");
        String myFilePath = book.getMyFilePath();
        String text = book.readAllBytesJava7(myFilePath);
        System.out.println(text);
    }
}
