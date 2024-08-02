package Day21_Mutable_ImmutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_mutable_iniimutable {
    public static void main(String[] args) {

        String str = "Have a niceday";

        System.out.println(str); //Have a niceday
        System.out.println(str.toUpperCase()); //HAVE A NICEDAY
        System.out.println(str.toLowerCase());//have a niceday
        System.out.println(str.replace("a", "e"));//Heve e nicede
        System.out.println(str.substring(6));//niceday
        System.out.println(str);//Have a niceday
        System.out.println("---------------------------------------------------");
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(886,712,499,9720016,300,500,700,1352));
        System.out.println(sayilar); //[886, 712, 499, 9720016, 300, 500, 700, 1352]
        sayilar.remove(2);
        Integer silinecekSAyi=970020016;
        sayilar.remove(silinecekSAyi);
        sayilar.set(2,6350); // ikinci index update
        sayilar.add(5510);

        System.out.println(sayilar);  //[886, 712, 6350, 300, 500, 700, 1352, 5510]

        System.out.println("---------------------------------------------------");
        String str2=new String("Murat");//String str2="Murat";

        StringBuilder str3=new StringBuilder("babayigit");// babayigit
        System.out.println(str3);
        str3.append("20240531");
        System.out.println(str3);////babayigit20240531
        System.out.println("Yeni Kullanici Dosya No  "+str3);//Yeni Kullanici Dosya Nobabayigit20240531



    }
}
