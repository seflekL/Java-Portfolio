package Day15_scopeArrays;

public class C04_tekveciftUzunliktakiKelimlerisay {

    public static void main(String[] args) {
        //verilen bir strin array daki her bir kelimeyi kontrol edip
        // Arrayda kactane tek sayi uzunlugunda;
        //kactene cift sayi uzunlugunda kelime bulundugunu yazidirian bir method olusuturun

        String [] isimler ={"Meltem", "Seren", "Emrah"," Levent"};

        kelimesayilarininyazdir(isimler);
    }

    public static void kelimesayilarininyazdir(String [] arr){
        int teksayiAdet=0;
        int ciftsayiAdet=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length() % 2 == 0 ){

                ciftsayiAdet++;

            }else {

                teksayiAdet++;
            }
            System.out.println("Arrayde"+ teksayiAdet + "adet uzunlugu tek olan kelime " +ciftsayiAdet +"adet var");
        }


    }
}
