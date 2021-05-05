package homework11.task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static homework11.MyTextFormatter.getPalindromes;
import static java.nio.file.Files.readAllLines;

public class Task01 {
    //    private static final String INPUT_FILE = "inputTask01.txt"; //почему так не работает, ведь файл в папке resources?
    private static final String INPUT_FILE = "Lesson11/resources/inputTask01.txt";
    //    private static final String INPUT_FILE = "C:/Мои онлайн курсы/TMS/Files/inputLesson11Task01.txt";
//    private static final String OUTPUT_FILE = "outputTask01.txt"; // то же самое.
    private static final String OUTPUT_FILE = "Lesson11/resources/outputTask01.txt";
//    private static final String OUTPUT_FILE = "C:/Мои онлайн курсы/TMS/Files/outputLesson11Task01.txt";

    public static void main(String[] args) throws IOException {
        List<String> words = readAllLines(Path.of(INPUT_FILE));
        Files.write(Path.of(OUTPUT_FILE), getPalindromes(words));
    }
}
