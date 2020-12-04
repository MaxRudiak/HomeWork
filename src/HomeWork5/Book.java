package HomeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Book {

    private String separator;
    private String myFilePath;

    public String getSeparator() {
        return separator;
    }
    public String getMyFilePath() {
        return myFilePath;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }
    public void setMyFilePath(String myFilePath) {
        this.myFilePath = myFilePath;
    }

    public String readAllBytesJava7(String filePath) {
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }

}
