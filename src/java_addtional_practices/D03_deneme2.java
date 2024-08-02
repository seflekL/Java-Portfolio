package java_addtional_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03_deneme2 {

    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>(Arrays.asList("Ali,Veli,Cem"));

        String istenemeyenHarf="e";

        System.out.println(isimler);


        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains("e")){
                isimler.remove(i);
                i--;
            }

        }
        System.out.println(isimler);
    }
}
