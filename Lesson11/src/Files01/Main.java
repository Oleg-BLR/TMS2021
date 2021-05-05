package Files01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    //    public static final String OUTPUT_FILE = "Lesson11/resources/output.txt";
    public static final String OUTPUT_FILE = "C:/Мои онлайн курсы/TMS/Files/OldFileOutputStream.txt";
    public static final String OUTPUT_FILE2 = "C:/Мои онлайн курсы/TMS/Files/FileOutputStream.txt";
    public static final String OUTPUT_FILE3 = "C:/Мои онлайн курсы/TMS/Files/BufferedOutputStream.txt";


    public static void main(String[] args) {
//        //запись в файл СТАРАЯ ВЕРСИЯ КОДА, СЕЙЧАС ТАК НЕ ПИШУТ. ИИШУТ ВАРИАНТ НИЖЕ
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream(OUTPUT_FILE, false);
//            fos.write("sdfsdfds hhhshshs hshshs\n sbhshshs fgggggggggg\n".getBytes(StandardCharsets.UTF_8));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fos.close();
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//        }

        //запись в файл FileOutputStream
        try (FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE2, false);
             FileOutputStream fileOutputStream2 = new FileOutputStream(OUTPUT_FILE2, false)) {
            fileOutputStream.write("запись в файл FileOutputStream".getBytes());
            fileOutputStream2.write("fileOutputStream2_".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //запись в файл BufferedOutputStream
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(OUTPUT_FILE3))) {
//            bos.write("запись в файл BufferedOutputStream".getBytes(StandardCharsets.UTF_8));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //считать из файла
        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE2)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes)); // почему выводит fileOutputStream2_айл FileOutputStream, а не запись в файл FileOutputStreamfileOutputStream2_
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
