package java_addtional_practices;

import java.util.Scanner;

public class C05_Switch {

    public static void main(String[] args) {

    //kullanicdan kacinci aydai olugumuz bilgisni alip mevsim yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen sayi olarak kacinci ayda oldugumuzu girniz");

        int ayNo= scan.nextInt();

        if (ayNo== 1 || ayNo==2 || ayNo==12 ){

            System.out.println("kis");
        } else if (ayNo==3 || ayNo==4 || ayNo==5) {
            System.out.println("ilkbahar");


        } else if (ayNo==6 || ayNo==7 || ayNo==8) {
            System.out.println("yaz");


        } else if (ayNo==9 || ayNo==10 || ayNo==11) {
            System.out.println("sonbahar");



        } else{

            System.out.println("Ay numarasi 1 ile 12 de arasinda olamal");
        }

        switch (ayNo){
            case 1 :
            case 2 :
            case 12 :
                System.out.println("Kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Ilkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Ay numarasi 1-12 arasinda olmali");

        }

    }
}

