package day22_dateTimeVarags_Stringbuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p03_Localdate_time {

    public static void main(String[] args) {

        LocalDateTime suan= LocalDateTime.now();

        System.out.println("suan = " + suan);
        
        // Tarih  formatini ikendim duzenleye bilirim 
        //bunn icn datetime formatter class kullaniriz

        DateTimeFormatter format1=DateTimeFormatter.BASIC_ISO_DATE;

        System.out.println("format1 = " + suan.format(format1)); //

        //istedigmiz gibi tarih zaman yapmak icin
        
        /*
        İstedğimizz gibi bir tarih zamman formatı yapmak için
     
             GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */
    
    
    //03/06/2024
    
    DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/YYYY") ;

        System.out.println("format2 = " + suan.format(format2));

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("dd$$MM$$YYYY") ;

        System.out.println("format3 = " + suan.format(format3));

        DateTimeFormatter format4=DateTimeFormatter.ofPattern("d/M/YYYY EEEE") ;

        System.out.println("format4 = " + suan.format(format4));

        DateTimeFormatter format5=DateTimeFormatter.ofPattern("dd/MM/YYYY EEEE HH:mm") ;

        System.out.println("format5 = " + suan.format(format5));

        DateTimeFormatter format6=DateTimeFormatter.ofPattern("dd/MM/YYYY EEEE HH:mm a") ;

        System.out.println("format6 = " + suan.format(format6));
    }
    

}
