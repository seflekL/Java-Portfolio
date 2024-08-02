package day13_MethodCreation;

public class P01_methodOverloading_2005_1100_1130 {
    public static void main(String[] args) {


        toplam(6);
        toplam(3, 5);
        toplam(2.3, 3.1);
        toplam(2.5f, 3.7f);
        toplam(2.3, 3, 7f);
        toplam(2.3,5,3.7f);
    }
    public static void toplam(){
        int a=5;
        int b=7;
        System.out.println("toplam"+a+b);
    }
    private static void toplam(int sayi) {
        System.out.println("Toplam" + " " + " " + (sayi + sayi));

    }

    private static void toplam(int a, int b) {
        System.out.println("Toplam" + " " + (a + b)); //int

    }

    private   static void toplam(double a, double b) {  //dobule beriri
        System.out.println("Toplam" + " " + (a + b));
    }

    private  static void toplam(double a, int b, float c) {  //double guclu oldu icin double cikacarktir
        System.out.println("Toplam" + " " + (a + b));
    }
}