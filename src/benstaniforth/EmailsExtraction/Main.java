package benstaniforth.EmailsExtraction;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        String textFile = new String(Files.readAllBytes(Paths.get("sample.txt")));

        String[] words = textFile.split("\\s");

        Pattern pattern = Pattern.compile("softwire\\.com");


        int counter = 0;

        for (String snippet: words) {
            Matcher matcher = pattern.matcher(snippet);
            if (matcher.find()){
                counter++;
            }
        }

        System.out.println(counter);

    }
}
