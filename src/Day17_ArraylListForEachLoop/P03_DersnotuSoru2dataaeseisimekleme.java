package Day17_ArraylListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_DersnotuSoru2dataaeseisimekleme {
    public static void main(String[] args) {

        /*
Kullanicidan istedigi kadar isim alip,
Q'ya bastiginda girdigi isimleri bize
liste olarak dondurecek bir method olusturun.

 */
        System.out.println(isimlistesiOlustur());


    }

    public static List<String> isimlistesiOlustur() {
      Scanner scan=new Scanner(System.in);
        List<String> isimler=new ArrayList<>();
        String girilenIsim="";

        while(!girilenIsim.equalsIgnoreCase("q")){
            System.out.print("Listeye eklenecek ismi giriniz: ");
            girilenIsim= scan.nextLine();

            if(!girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }
        }
        return isimler;
    }
}

