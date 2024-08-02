package java_addtional_practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D02_deneme2 {

    public static void main(String[] args) {

         isimfirfir();


    }

  public static List<String> isimfirfir() {
      List<String> isimler=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
      String isim="";

      do {
          System.out.println("Lutfen Listeye ekelenecek ismi giriniz ve Cikmak icin Q harfine basiniz");
          isim=scan.nextLine();

          if (!isim.equalsIgnoreCase("q")){
              isimler.add(isim);

          }
      }while (!isim.equalsIgnoreCase("q"));
          System.out.println(isimler);
          return isimler;
      }
}
