package day26_Inheretiance;

public class P03_Corsa extends P02_Opel {

     P03_Corsa (){
         super();
         System.out.println("Corsa constructor calisti");


     }

     /*
     Javada  olusturlan bir objeyece ilk deger atanmasinin yapilabilmesi icin costructor calistirilamasi
     zorunldur

     Biz constructor calsitirmadan paran variable lara nasil ulasiyoruz
     Javada child classlarda obje olusturuldungda parent classlardaki consturlari otmatik olarak
     calistirlmasiiicn mekanizme vardir
     Java her class icin default constructor olsurdu gibi extend keyword kullanan classlar
     icin her bir constructor ilk satirina super constructor call kouyar
      */
    String model="Corsa";
    String motor="VVT";
    String renk="eflatun";

    public static void main(String[] args) {
        P03_Corsa corsa1=new P03_Corsa();

        System.out.println(corsa1.model);//cora1 gidip ne meodel warsa yazicak
        System.out.println(corsa1.motor);//corsa bir motor
        System.out.println(corsa1.renk); //eflatun

    }

}
