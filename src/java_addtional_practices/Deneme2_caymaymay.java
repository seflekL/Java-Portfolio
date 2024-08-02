package java_addtional_practices;

import java.util.Scanner;

public class Deneme2_caymaymay {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsuniz");
        double bardak=scan.nextInt();
        System.out.println("Kac adet seker kullaniyorsunuz");
        double seker= scan.nextInt();;
        double yilliksekerTuketin=(bardak*seker*2.77)*365/1000;
        double kirlyilliksekertuketimi=yilliksekerTuketin*40;

        if (seker== 0){
        System.out.println("Aferin boyle devam et ");

    } else {
            System.out.println("Yillik seker tuketimi"+yilliksekerTuketin+"\n"+"Kirkyillik tuketimi"+kirlyilliksekertuketimi);
        }
    }
}
