package day12_Methodolusturma;

public class C02_Method_olusturmak {
    public static void main(String[] args) {

          buyukOlaniYazdir(10, 8);
          buyukOlaniYazdir(7,5);
          buyukOlaniYazdir(5, 5);


    }

    //meethod class icinde ama diger methodlarin disnda  olusturlmaldir

    //cerilen iki sayidan buyuk olani yazdiran bir method olusturun.

    //eger sayilar esitse, "esit sayilarda buyuk olan yoktur"

    public static void buyukOlaniYazdir(int sayi1, int sayi2) {

        if (sayi1 > sayi2) {

            System.out.println("Sayilardan buyuk olan " + sayi1);

        } else if (sayi2 >sayi1) {
            System.out.println("Sayilardan buyuk olan"+ sayi2);

        }else{
            System.out.println("esit sayilarda buyuk olan yoktur");
        }
    }

}
