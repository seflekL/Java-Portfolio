package java_addtional_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03_listedenIsimSilme {

    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>(Arrays.asList("Ali", "Veli","Cem"));

        String istenemyenharf="e";

        System.out.println(isimler);

        for (int i = 0; i < isimler.size(); i++) {
            // i indexti istenmey harf iceriyorsu i indexsi silelilim
            if (isimler.get(i).contains("e")){

                isimler.remove(i);
                    i--;
            }

        }
        System.out.println(isimler);
    }
}
