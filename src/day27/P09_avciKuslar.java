package day27;

public class P09_avciKuslar extends P08_Kuslar {

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        P09_avciKuslar kartal1= new P09_avciKuslar();

        System.out.println(kartal1.beslenme);
        System.out.println(kartal1.hareket);
        System.out.println(kartal1.gaga);
        System.out.println(kartal1.pence);
        System.out.println(kartal1.solunum); //badan alicak ak ciger yazicak
        System.out.println(kartal1.omur);//hayvanlar babaclassdan alir

        P08_Kuslar kartal2=new P09_avciKuslar(); //p08 goitti parent dan hayvanalrda laicak
        System.out.println(kartal2.beslenme);

        System.out.println(kartal2.gaga);// gagalari vardir alicak
        System.out.println(kartal2.hareket);//harerekte derler
        System.out.println(kartal2.kanat); //kuslar kanallidir

        P08_Kuslar kartal3=new P08_Kuslar(); // basrtada sonrda p08 dedik buara ileisimiz kalmadi

        System.out.println(kartal3.gaga); // hoop kuslar alir
        System.out.println(kartal3.kanat);// hooop kuslarda alir
        System.out.println(kartal3.cogalma); // hoop kslarda alir
       // kartal3.pence.sout obje herzaman paranta gider child dan alamaz  bu yuzden bulamadi
        System.out.println(kartal3.beslenme);//bulamadigi icin parent dan alicak
        System.out.println(kartal3.omur);//Hayvanlar classdan alicak

        //P08 Hayvanlar kartal4=mew P07 Kuslar(); parentta bulnan constructor child class data turu
        //yaparak obje olustramaz


        P07_Havanlar kartal4=new P09_avciKuslar();

        System.out.println(kartal4.solunum);

    }


}
