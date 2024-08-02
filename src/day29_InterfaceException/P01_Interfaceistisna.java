package day29_InterfaceException;

public interface P01_Interfaceistisna {

    /*
    Devam eden projelerde Interfacelerde sonradan mudale etmek gerekirse
    0 Interface kullanan classlarda ciddi problemler olusabilir

   Java 8 versionunde bu knudaki beklentilre istisnai bir cozum onermistir

   Sonradan eklenen methodlarin problem cikarmamasi cin
   child classlara implement ettigimizde interface icindeki istisnai methodlarin boyd ye sahip olmasina
   imkan tanimistir.
   Bunu static ve degult keywordleriyle saglar

     */
    void method1();
    void method2();

    ///public protected void method5(){}  izin vermez
    public default void method4(){}
    static void method5 () {}

    // Buradaki default access modifer degildir
    //Acces modifier publtir ve ikinci bir accesss modifier olmaz
    //Buradaki default keyword kullanimi farkli bir durum ifafe eder

    /*
    Implement ettigimiz P01 interface sonradan ekledimiz methodlar boyd ye sahip oldugu icin override etme zorunlulug yotur
    interface icnde boysi olan istinia methodlar olustrmak icin statc ve deafult keywordleri kullanilir
    o methodlara ereisim yonteminde ki farkliliklara gore static yda default olcagina kaarar verilir

     Static keyowrd ile olusturlan istinasi methodlara class ismi ile ulasilabilir
     defualt eyowrd ile olusturulan istisnai methodlara obje olusturularak ulsailir

     */

    public static void main(String[] args) {
        P01_Interfaceistisna.method5(); // calisilr cunku static

        P02_childofInterfaceIstisna obj=new P02_childofInterfaceIstisna();
        obj.method4();
    }
}
