package Day15_scopeArrays;

public class Hastane {

    /*
    Java da objelerin ortak olan tum variable statik olarak olusturulir
    sadece bir obje iin gerekliolan variablar ise instance olusturulur

    Biz bir obje olusturudugumuzda Java o obde icin tum instance varibalelarin
    bir kopuyasini olusuturur
    Olusturan obje insantce variablari iliskendiriyor

     */

   static String hastaneIsmi="Yildiz hastanesi"; //herkez icin ortak static yaptik
   static String hastaneAdres="Uskudar";
   static String hastaneBasHekim="Java Levent";

   String personalIsmi=""; // henuz atama yapmadik
   String personalAdres=""; // henuz atama yapmadik
   int    peronalAge; // henuz atama yapmadik
    String personalGorev="";

    public static void main(String[] args) {


    Hastane personal01=new Hastane();

        //System.out.println(personal01.peronalAge);
        //System.out.println(personal01.personalAdres);
        //System.out.println(personal01.personalIsmi);
        //System.out.println(personal01.personalAdres);
//
        //personal01.personalIsmi="Fatma Demir";
        //personal01.personalAdres="Ankara";
        //personal01.peronalAge=18;
        //personal01.personalGorev="Hemsire";
//
        //System.out.println(personal01.peronalAge);
        //System.out.println(personal01.personalAdres);
        //System.out.println(personal01.personalIsmi);
        //System.out.println(personal01.personalAdres);

       // Hastane personel02=new Hastane();
       // personel02.personalIsmi="Rena Ulker";
       // personel02.personalAdres="Istanbul";
       // personel02.peronalAge=18;
       // personel02.personalGorev="Hemsire";
//
        //System.out.println(personel02.personalIsmi);

        Hastane personel03=new Hastane();

        /*
        uctane kadro actim burda artik yyazmasakda olur

         */


    }


}
