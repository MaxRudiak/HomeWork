package HomeWork5;

import java.io.File;
import java.util.*;

/**
 * поиск 10 наиболее используемых слов
 */
public class HW5_2_2 {
        public static void main(String args[]) {
            Book book = new Book();
            book.setSeparator(File.separator);
            String separator = book.getSeparator();
            book.setMyFilePath("HomeWork" + separator + "resources" + separator + "ВиМ.txt");
            String myFilePath = book.getMyFilePath();
            String text = book.readAllBytesJava7(myFilePath);

            String[] words = text.toLowerCase().split("[\\p{Punct}\\s]+");
            Map<String, Integer> wordCounts = new HashMap<String, Integer>();

            for (String word : words) {
                Integer count = wordCounts.get(word);
                if (count == null) {
                    count = 0;
                }
                wordCounts.put(word, count + 1);
            }

            Map sortedMap = sortByValue(wordCounts);
            //System.out.println(sortedMap);

            Iterator iterator = sortedMap.entrySet().iterator();
            int ii  = 0;
            while (iterator.hasNext()) {

                Map.Entry mapEntry = (Map.Entry) iterator.next();
                if(ii < 10){
                    System.out.println((ii + 1) + ". Слово:  " + "'" + mapEntry.getKey() + "'"
                            + " встречается " + mapEntry.getValue() + " раз;");
                    ii++;
                }
            }

        }

    public static Map sortByValue(Map unsortedMap) {
            Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
            sortedMap.putAll(unsortedMap);
            return sortedMap;
        }

    }

    class ValueComparator implements Comparator {

        Map map;

        public ValueComparator(Map map) {
            this.map = map;
        }

        public int compare(Object keyA, Object keyB) {
            Comparable valueA = (Comparable) map.get(keyA);
            Comparable valueB = (Comparable) map.get(keyB);
            return valueB.compareTo(valueA);
        }
    }

