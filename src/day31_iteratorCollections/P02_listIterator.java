package day31_iteratorCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P02_listIterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,5,3,7,8,9,11,12));

        //Listin tum elamanlaribi topla

        int  toplam=0;

        Iterator itr=sayilar.iterator();

        while (itr.hasNext()){

            toplam+=(Integer) itr.next();
        }
        System.out.println(toplam);

        /*
        Iterator da dikkat etmemiz geken en onemli sey olusturalan objenin nerde oldugurdr

         */
    }
}
