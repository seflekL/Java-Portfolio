package java_addtional_practices;

import java.util.Scanner;

public class C02_Casting_Class_Upper_Lower {
    public static void main(String[] args) {


   /*
    -Kullanicidan bir harf isteyin, kullanici kucuk harf
    -verirse harfi buyuk harfe cevirin, Buyuk harf verirse
    -kucuk harfe cevirin. Eger harf disinda farkli bir karakter girerse
    -“Harf girmelisiniz” diyerek uyarin. Soruyu 3 farkli sekilde cozun

  - Casting kullanarak
  - Wrapper class hazir method’larla
  - String manipulasyon kullanarak

    -Wrapper classlar primitive data turleri ile
    -hazir methodlar kullanabilmemeiz icin
    -java nin olusturdugu classlardir
    -Boolean-Character,Byte,Short,Integer,Long,float,Double
    -primitive'ler ile wrapper class'lar arasinda direk gecis mumkundur
     */
        //bitmedi



        Scanner scan = new Scanner(System.in);

        System.out.println("Lufen bir harf giriniz");

        char harf=scan.next().charAt(0); //uzun metin olasa da tek harf alicak

        if (Character.isLowerCase(harf)){ //girilen  harfin kucuk harf olup olmadigini bakar

            harf=Character.toUpperCase(harf);
            System.out.println("harf = " + harf);

        } else if (Character.isUpperCase(harf)) {

            harf=Character.toLowerCase(harf);
            System.out.println("harf = " + harf);

        }else{

            System.out.println("Harf Girmelisiniz");
        }
    }
}
