package Day24;

public class P03_RaporClass {

   private      int satisTutari;
   private       int toplamSatisTutari;


    /*
    Istenen gorev
    satis tutarlari  bilgisi baka departmantlar tarindan gorulemesin ama bunlara her departman kendine var
    olan bilgiye atayabilsin

    Toplam Satis tutari uzrinde degisiklik yaplmasin ama bu tatar uzirnde
    tutar degeri goruntulenebileisn

     */

   /*
   Encapslation islemi 2 adimda yapuilir;
   1-Access modifier private yapilarak erisimin engeller
   2=Sinirli islem yapabilirsin  ama sonuclari veya diger verileri
   goremesin
   -Deger atayamasin ama sonuclari ve verileri goruntuesin
    */

   public void setToplamSatisTutari(int toplamSatisTutari) {
      this.toplamSatisTutari = toplamSatisTutari;
   }

   public void setSatisTutari(int satisTutari) {
      this.satisTutari = satisTutari;
      toplamSatisTutari+=satisTutari;

   }

   public int getSatisTutari() {

      return satisTutari;
   }

   public int getToplamSatisTutari() {
      return toplamSatisTutari;

   }
}
