package Day14_WhileLoop;

import java.util.Scanner;

public class P02_WhileLoop {
    public static void main(String[] args) {
/*
Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
ve bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
bu negatif sayiyi sayi adedine ve toplama eklemeyin
 */

        Scanner scan=new Scanner(System.in);
        String karakter="";
        int toplam=0;
        int sayi=0;
        int flag=0;
        while(!(karakter.equals("Q")|| karakter.equals("q"))){ //dongu hangi sartlarda devam etsin
            System.out.print("Toplamak icin bir sayi girniz\nCikis yapmak icin Q tusuna basiniz\n");

            if(scan.hasNextInt()){
               sayi=scan.nextInt(); // her dongude yeni bir sayi aliyor
                if(sayi<0){
                    System.out.println("Negatif Sayi kullanamazsiniz");
                }else{
                toplam+=sayi;
                flag++;

                }
        } else if (scan.hasNextLine()) {
                karakter= scan.nextLine();
            }

            }
        System.out.println("Girdiginiz "+flag +" "+"adet pozitif tamsaynin toplamai" +" "+ toplam);

        }
}
