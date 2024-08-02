package day12_Methodolusturma;

public class C03_methodOlusturma_terstyazdirma {

    public static void main(String[] args) {

        terstenYazim("Babayigit hocam bu isi biliyor");

    }

    //verilen metni tersten yazdirin

    public static void terstenYazim(String metin) {
        System.out.println("");
        for (int i = metin.length() - 1; i >= 0; i--) {

            System.out.print(metin.charAt(i));

        }


    }
}
