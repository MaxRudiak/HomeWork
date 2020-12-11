package HomeWork7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        printRates(new NBRBLoader());
        printRatesInFile (new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println("Курс евро: " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Курс рубля: " + loader.load(SiteLoader.Currency.RUB));
        System.out.println("Курс доллара: " + loader.load(SiteLoader.Currency.USD));
    }

    public static void printRatesInFile (SiteLoader loader) throws FileNotFoundException {
        String separator = File.separator;
        String myPath = "";
        Scanner scanner = new Scanner (System.in);
        System.out.println("Укажите путь для сохранения информации о курсах валют в файле формата txt: ");
        myPath = scanner.nextLine();
        Path path = Paths.get (myPath);
        if (Files.exists(path)) {
            myPath = myPath;
        } else {
            System.out.println("Папка " + myPath + " не найдена");
            System.out.println("Курсы будут сохранены в папке HomeWork" + separator + "src" + separator + "HomeWork7") ;
            myPath = "HomeWork" + separator + "src" + separator + "Homework7" + separator + "Курсы валют.txt";
        }
        try {
            File file = new File(myPath);
            String rate1 = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.EUR));
            String text1 = "Курс " + SiteLoader.Currency.EUR + " = " + rate1;
            String rate2 = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.RUB));
            String text2 = "Курс " + SiteLoader.Currency.RUB + " = " + rate2;
            String rate3 = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.USD));
            String text3 = "Курс " + SiteLoader.Currency.USD + " = " + rate3;

            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write (text1);
            bw.newLine();
            bw.write (text2);
            bw.newLine();
            bw.write (text3);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

