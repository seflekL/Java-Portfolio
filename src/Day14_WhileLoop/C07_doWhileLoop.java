package Day14_WhileLoop;

import java.util.Scanner;

public class C07_doWhileLoop {

    public static void main(String[] args) {
        //soru 3 Kullanidacan bir pozitif sayi isteyin sayinin tam kare olup olamadigni bulunuz
        //rtamkare ise true deigls false yazdirin
        //input 16  output 4

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

        int karekok= 1;
        boolean tamKaremi=false;
        while(karekok* karekok <=sayi){
            if(karekok*karekok==sayi){
                tamKaremi=true;
            }

            karekok++;
        }

        System.out.println(tamKaremi);
    }
}
