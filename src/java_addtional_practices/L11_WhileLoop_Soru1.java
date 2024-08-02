package java_addtional_practices;

public class L11_WhileLoop_Soru1

{

    /*
    While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin.

     */
    static int sayi=10;
    static String sayilar="";
    public static void main(String[] args) {

        while (sayi<1000){

            if (sayi%7==0){
                sayilar+=sayi+",";
            }
            sayi++;
        }
        System.out.print(sayilar);
    }

}