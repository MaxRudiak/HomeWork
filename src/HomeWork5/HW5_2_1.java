package HomeWork5;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2.1 Поиск уникальных слов
 */
public class HW5_2_1 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setSeparator(File.separator);
        String separator = book.getSeparator();
        book.setMyFilePath("HomeWork" + separator + "resources" + separator + "ВиМ.txt");
        String myFilePath = book.getMyFilePath();
        String text = book.readAllBytesJava7(myFilePath);

        Pattern pattern = Pattern.compile("[а-яА-Я\\d]+", Pattern.UNICODE_CHARACTER_CLASS |
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        Set <String> words = new HashSet<>();
        while (matcher.find())
            words.add(matcher.group().toLowerCase());
        for (String word : words)
        {
            System.out.println(word);
        }
    }
}

