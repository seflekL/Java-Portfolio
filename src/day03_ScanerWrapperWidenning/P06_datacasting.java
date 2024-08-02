package day03_ScanerWrapperWidenning;

public class P06_datacasting {
    public static void main(String[] args) {


        /*
        kucuk data turndeki datalari buyuk dataya turune atamak istersek
        java bu genisleme islemini otamatik olarak yapar buna auto widing

        //Byte<Short<int<Long<Float<Double daa da surakana
                */
        byte a=15;
        short b=a;

        int c=a;
        double d=a;
        // buyuk data turundeki degeri kucuk data turundeki variable ile atmak istersek
        //java bunu otamatik olarak yapmaz Data veri kaybi olabilcegi icin  sorumluluk almamaiziister
        //donusum sorunlu olmayacaksa biz bir sorumlulu almak icin buyuk daa turunun onune degistirmek
        //istedigimiz degeri yazariz
        //bu olaya expilicit narrowing denir
        double sayi1=234.5;

        int sayi2=(int)sayi1; //double sayiyiy int yapabilmek icin araya (int) ekliyoruz overwrite

        short sayi3=(short)sayi1; //(short parentez icnde ki  sorumlululk sen aliyorsun )

        byte sayi4=(byte)sayi1;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi4 = " + sayi4);



    }
}
