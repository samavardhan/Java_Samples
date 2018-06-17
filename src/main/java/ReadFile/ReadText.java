package ReadFile;

import java.io.*;


public class ReadText {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/mpg902/Desktop/springpractice/AdditionOfNumbers/text.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String data;
        while ((data = br.readLine()) != null)
            System.out.println(data);

//        if(data != null){
//            System.out.println("exist");
//        }
//        else {
//            System.out.println("Not exist");
//        }
    }
}
