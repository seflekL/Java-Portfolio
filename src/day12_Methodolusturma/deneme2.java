package day12_Methodolusturma;

public class deneme2 {
    public static void main(String[] args) {


    carpim2(5, 20);

    carpim2(500, 10, 30);

    }


    public static void carpim2 (double sayi1,double sayi2) {
        System.out.println(sayi1*sayi2);

    }

    public static void carpim2 (double sayi1, double sayi2,double sayi3){

        System.out.println(sayi1*sayi2*sayi3);

        faktoriyelDegyazdir(5);
    }


    //faktorueyel deniyeleim
    public static void faktoriyelDegyazdir (int sayi){
        int sonuc=1;
            for (int i = sayi; i >=1 ; i--) {
               sonuc*=i;

            }
            System.out.println(sonuc);


    }

}
