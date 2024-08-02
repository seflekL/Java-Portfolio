package Day15_scopeArrays;

public class P07_EnuzunKelimeenKisaKelime {
    public static void main(String[] args) {
        //Verilen String attay deki en uzun
        //ve en kisa kelimwri yazdiran method olusturan

        String [] isimler={"Murat","Ela","Abdulrrahman","Sibel","Tarik","Sena"};
           // burdaki her isme bakacagim isimlerin iciersinde
        //britane array olustur 0 sifir elamani ona atayacagim bunu yine bir sonraki
        //ile karsilastir for loopp
        enUzunEnKisaYazdir(isimler);
    }


    public static void enUzunEnKisaYazdir(String[] kelimeler) { //methodun parametresini array olarak belirledik
        String enKisa=kelimeler[0];
        String enUzun=kelimeler[0];
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length() > enUzun.length()) {
                enUzun=kelimeler[i];
            }
            if (kelimeler[i].length()<enKisa.length()){
                enKisa=kelimeler[i];
            }

        }
        System.out.println("enKisa = " + enKisa);
        System.out.println("enUzun = " + enUzun);


    }
}