package Day08_StringManipulation_testde_var;

import java.util.Scanner;

public class P08_Soru {
    public static void main(String[] args) {

        /*
                Kullanicidan bir mail alin
             - mail @ icermiyorsa "gecersiz mail"
        	 - mail @gmail.com icermiyorsa, "mail gmail olmali" x
        	 - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        	 - mail adresi bışluk içeriyorsa "mail adresinizde boşluk bırakmamalısnız "
        	 - mail adresi sadece @gmail.com girilirse "mail adresinizi eksik girdiniz"
        	   yazdirin.

         
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen mail adresinizi giriniz: ");
        String mail=scan.nextLine();
        //if-Else
        //  +++ : tümünde hata yoksa mail girişi başarılı diyebilirim
        //  ---: ilk hatayı bulunca durur. Sonraki hataları farkedemez

        //bağımsız if ile yapabilirim
        //   ++ her hata bulunur.
        //   -- hhepsini kontrol ettiğinde tamamı başarılı diye bir mesaj vermek için aksiyon gerekir
        // flag(sayac) koymalıyız

        // BAĞIMSIZ IF ile çözelim
        int hataSayaci=0; //flag

        //mail @ icermiyorsa "gecersiz mail"
        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
            hataSayaci++;

        }
        //mail @gmail.com icermiyorsa, "mail gmail olmali"
        if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
            hataSayaci++;
        }
        // mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

        if (!mail.endsWith("@gmail.com")){

            System.out.println("mailde yazim hatasivar");
            hataSayaci++;

        }
        //mail adresinde bolsuk birakamazsiniz

        if (mail.contains(" ")){

            System.out.println("email adresinde bosluk birakamazsiniz");
            hataSayaci++;



        }//egerbuyuk kucuk harfi ignore edilmek istenrise
        if (mail.equalsIgnoreCase("@gmail.com")){
            System.out.println("Mail adresinizi eksik girdiniz");
            hataSayaci++;

            //son olarak da flah icin basari ile kaydedildi mesaji


            }
        if (hataSayaci==0){

            System.out.println("Mail adresiniz basriyla kaydedildi.");

        }














    }


}