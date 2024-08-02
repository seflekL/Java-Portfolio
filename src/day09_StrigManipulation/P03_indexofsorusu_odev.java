package day09_StrigManipulation;

import java.util.Scanner;

public class P03_indexofsorusu_odev {

    public static void main(String[] args) {

        /*

Kullanicidan bir String ve aranacak metin alin.
Aranan metnin String icerisinde kullanimini kontrol ederek
asagidaki cumlelerden uygun olanini yazdirin.
    - String aranan metni icermiyor
    - Aranan metin String'de sadece 1 kere kullanilmis
    - Aranan metin String'de sadece 1’den fazla kullanilmis
index of ile coz ulen
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir metin girniz");

        String metin= scan.nextLine();

        //"Java da Fenerbahce Sampiyon";

        int firstindex= metin.indexOf("fenerbahce");

        System.out.println(metin.indexOf("Fenerbahce"));

        int seccondindex=metin.indexOf("fenerbahce"+ 1);

        System.out.println("ikinci kez "+metin.indexOf(seccondindex));


        }







        }





