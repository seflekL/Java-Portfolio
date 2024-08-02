package day30_Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P02_execeptions {

    public static void main(String[] args) {

        try {
            FileInputStream dosyaYolu=new FileInputStream("src/day30_Exeception/java");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulanamadi");
        }
    }
}
