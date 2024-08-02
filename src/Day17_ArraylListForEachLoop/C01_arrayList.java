package Day17_ArraylListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {

        //Verilen string bir listedki
        //Kullanilan toplam harf karakter sayisni yazdirin

        List <String> isimler=
                new ArrayList<>(Arrays.asList("Seren","Eghnbal","Ilgar","Alicabbar"));

        int toplamkarakarakterrSayisi=0;
        for (int i = 0; i < isimler.size(); i++) {
            toplamkarakarakterrSayisi+= isimler.get(i).length();


        }

        System.out.println("Listede toplam + "+toplamkarakarakterrSayisi+"  adet harf veya kullanilmis");
    }
}
