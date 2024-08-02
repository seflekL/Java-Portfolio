package day30_Exeception;

public class P04_tryCatch {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=0;

        try {
            System.out.println("satir 1");
            System.out.println("satir 2");
            System.out.println(sayi1/sayi2);
            System.out.println("satir 3"); // grekesiz anam
            System.out.println("satir 4"); //gereksiz anam




        } catch (Exception e) {
           // buradaki e variable olarak ifade edilir
            //e ismi veirlen variable yakalanan exception e icine kaydeder
            //tryi ile bir exeception yakalanio e variabeina atama yapabilimek icin
            //uygun exception tur yazilmalidir-

            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("hata msg: "+e.getMessage());
        }
    }
}
