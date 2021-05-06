package homework11.task03;

import homework11.MyTextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task03 {
    private static final String BLACKLIST = "Lesson11/resources/blackListTask03.txt";
    private static final String BLACKLIST_SEPARATOR = "[,\\s]+";
    private static final String TEXT = "Lesson11/resources/initialTextTask03.txt";

    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of(TEXT));
        String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);

        if (!MyTextFormatter.hasBlacklistWordInString(text, blacklist)) {
            System.out.println("В тексте не встечаются слова из чёрного списка.");
            return;
        } else {
            System.out.println("В тексте обнаружены слова из чёрного списка.\nПредложения, подлежащие исправлению:");
        }
        List<String> sentences = MyTextFormatter.getSentencesFromText(text);
        int sentencesWithBLWords = 0;
        for (String sentence : sentences) {
            if (MyTextFormatter.hasBlacklistWordInString(sentence, blacklist)) {
                System.out.println(sentence);
                sentencesWithBLWords++;
            }
        }
        System.out.println("Всего предложений, подлежащих исправлению: " + sentencesWithBLWords);
    }
}
