package ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {

    public static void main(String[] args) {
        try{
            File file = new File("/Users/mpg902/Desktop/springpractice/AdditionOfNumbers/text.txt");

            FileReader fileReader = new FileReader(file);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Exception file not found");
        }
    }
}
