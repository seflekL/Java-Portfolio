package day30_Exeception;

import java.io.FileInputStream;
import java.io.IOException;

public class P06_parentchildexceptions {
    public static void main(String[] args) throws IOException {

        FileInputStream dosyaYolu=new FileInputStream("src/day30_Exeception/java");
        int k=0;
        while((k= dosyaYolu.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            // Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }
    }

}
