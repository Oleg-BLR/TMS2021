package homework11.task02;

import homework11.MyTextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task02 {
    private static final String INPUT_FILE = "Lesson11/resources/inputTask02.txt";
    //    private static final String INPUT_FILE = "C:/Мои онлайн курсы/TMS/Files/inputLesson11Task02.txt";
    private static final String OUTPUT_FILE = "Lesson11/resources/outputTask02.txt";
//    private static final String OUTPUT_FILE = "C:/Мои онлайн курсы/TMS/Files/outputLesson11Task02.txt";

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of(INPUT_FILE));

        List<String> sentences = MyTextFormatter.getSentencesFromText(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = MyTextFormatter.getCountWordsInString(sentence);
            if (MyTextFormatter.hasPalindromeInString(sentence) || (numberOfWords >= 3 && numberOfWords <= 5)) {
                filteredSentences.add(sentence);
            }
        }

//        Files.write(Path.of(OUTPUT_FILE), filteredSentences, true);
        Files.write(Path.of(OUTPUT_FILE), filteredSentences);
    }
}
