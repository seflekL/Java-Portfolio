package java_addtional_practices;

import java.util.Arrays;

public class S03_ArrayMevsimler {

    //Ilkbahardan baslayarak 4 mevsim array olusturun. Yazdan geriye dogru mevsimleri siralayin.
    public static void main(String[] args) {

        String[]mevsimler=new String[4];
        mevsimler[0]="Ilkbahar";
        mevsimler[1]="Yaz";
        mevsimler[2]="Sonbahar";
        mevsimler[3]="Kis";

        System.out.println(Arrays.toString(mevsimler));

        String bosKova=mevsimler[0];
        mevsimler[0]=mevsimler[1];
        mevsimler[1]=bosKova;


        String boskova2=mevsimler[2];
        mevsimler[2]=mevsimler[3];
        mevsimler[3]=boskova2;

        System.out.println("Yeni hali: "+ Arrays.toString(mevsimler));






    }
}


