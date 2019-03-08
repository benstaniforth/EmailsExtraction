package benstaniforth.EmailsExtraction;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        String sampleText = new String(Files.readAllBytes(Paths.get("sample.txt")));

        int counter = 0;

        for (int i = 0; i < sampleText.length(); i++) {
            if (sampleText.substring(i).startsWith("@softwire.com")){
                counter++;
            }
        }

        System.out.println(counter);

    }
}
