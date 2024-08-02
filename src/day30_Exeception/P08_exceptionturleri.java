package day30_Exeception;

public class P08_exceptionturleri {
    public static void main(String[] args) {

        /*

       null pointer exveption
1-null pointer Exception herhangi bir variable deger atanamadan kullanilmaya calilirsa
hata verir
eger null olarak atama yapilirsa calisana kadar hata vermez ama run edilince degerin
null oldugu kullanamacagini ifade eder

2-StringIndexOutOfBoundsException  ve ArrayindexoutofBoundsExceptopn
 buraada her ikisndede index degeridnen fazla bir deger kullanilarak islem yapilmaya
 calisirsa aralik disinda bir deger girildigini ifade eder


3- AritmeticException

Matemiksel islemerde sonuc cermeyen durumlarda (sayi/0)
ortaya cikar



         */
//4-NumberFormat exception
        String sayi1="12a";
        String sayi2="48";

        System.out.println(sayi1+sayi2);

       // System.out.println(Integer.parseInt(sayi1)+Integer.parseInt(sayi2)); ead "main" java.lang.NumberFormatException: For input string: "12a"


    //5-Class cast Exception

        Integer sayi=10;

        Object str=sayi;//Object has a Integer

        String str2= (String) str; //String is an Object



}   }
