package day25_encapsulation_inheritance;

public class P01_EncapsuleClass {

    /*
    AccessModifier
    private---->sadece kendi class indan ulasabilir
    default----> bulundugu package icindeki tum classlardan
    protected-->bulundugu package icinde ki tum classlardan ve child classlardan
    public-----> proje icinedeki tum classlardan ve child classdan ulasilabilir

     */

    private String isim="Mest hastenesi";
    private String basHekim="Dr.Levent Seflek ";
    private String address;
    private String telefon;
    public  String hastaAD;
    private int hastaNo=1;

    public String getHastaAD() {
        return hastaAD;
    }

    public int getHastaNo() {
        hastaNo++;
        return hastaNo;

    }

    public String getTelefon() {
        return telefon;
    }

    public String getAddress() {
        return address;
    }

    public String getBasHekim() {
        return basHekim;
    }

    public String getIsim() {
        return isim;
    }
}
