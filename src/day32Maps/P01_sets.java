package day32Maps;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class P01_sets {
    public static void main(String[] args) {

        Set <Integer> hashset= new HashSet<>();

        Set<Integer> treeset= new TreeSet<>();

        long baslangicZamani= LocalTime.now().toNanoOfDay();

        Random rrd=new Random();

        for (int i = 0; i <1000000 ; i++) {

            hashset.add(rrd.nextInt());

        }
        long bitismani= LocalTime.now().toNanoOfDay();

        System.out.println("Hashset sure "+(bitismani-baslangicZamani));

    }
}
