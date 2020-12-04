package HomeWork5;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        int i;
        int last = 0;
        int count = 0;
        do {
            i = text.indexOf(word, last);
            if (i != -1) count++;
            last = i+word.length();
        } while(i != -1);
        return count;
    }
}
