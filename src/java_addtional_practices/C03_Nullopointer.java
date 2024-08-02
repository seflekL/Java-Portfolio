package java_addtional_practices;

public class C03_Nullopointer {
    public static void main(String[] args) {

        /*
        1- Null Pointer : bir deger deil isaretcidir***

        b ve c deger atanmayan variablelardir.
        Java deger atanmayan b;yi kullanmaniz  Hicbir sekilde izin vermez
        ama null olarak isretlenen  Variablelari sadece yazdirmamiza  izin verir

        2- Null Pointer; deger atamak istemedigimiz variable'lari isratelemek icin kullanilir
            b ve c deger atamanyan variable;lardir
            javav deger atanmayan b yi kullanmiza HIC BIR SEKILDE IZIN VERMEZ
            sadce kullanilan class degil projenin hi bir class calistirlamaz
            Null olrak israletnen variable kodun  Calismasina engel olmaz

        3-Null olarak isratelenen bir variable Yzdiralabilir  ama  baska hic bir method ile KULLANILAMAZ






         */
        //Asagidaki kod calsitirlar her satir ne zyazdirir

        String a = "";     // degeri var

        String b;          //deeri yok  //

        String c = null;   //degeri yok

        String d = "Tava"; //degeri var

        System.out.println(a);// konsolda bos satir cikar

       // System.out.println(b);// Compile Time Error
                              //degeri olmaayan Variable Kullanlamaz

        System.out.println(c);// null yazar

        System.out.println(a+d); //''+Tava==Tava
                                 //dgeri olamayan bir variable Kullanilamaz
        System.out.println(c+d);//null + "Tava"==>null Tava

        System.out.println(a.length());// jhicligin ==>
                                       //lenght  karekater sayisi ==> kullanilan karaket sayisi

       // System.out.println(b.length()); //Copile Time error
        //  ahata weriri bi bisey yok icinde

        System.out.println(c.length());//Runtime da yani calistirinca
                                       //NullpointerException veriri
    }
}
