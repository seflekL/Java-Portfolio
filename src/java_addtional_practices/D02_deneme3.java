package java_addtional_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D02_deneme3 {


    public static void main(String[] args) {

            String [] arrMevsimler = new String[4];
            arrMevsimler[0]="IlkBahar";
            arrMevsimler[1]="Yaz";
            arrMevsimler[2]="Sonbahar";
            arrMevsimler[3]="Kis";

        List<String> arr=new ArrayList<>();
        arr.add("Ilkbahar");
        arr.add("Yaz");
        arr.add("Sonbahar");
        arr.add("Kis");

        System.out.println((Arrays.toString(arrMevsimler)+"\n"+arr));


     }
}
