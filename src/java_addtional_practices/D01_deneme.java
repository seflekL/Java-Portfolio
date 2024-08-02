package java_addtional_practices;

public class D01_deneme {

    public static void main(String[] args) {


    /*
    12345 sayisinin herbir basamagini konsolda altalta yazdirin.
       input: 12345
       output: 1
               2
               3
               4
               5
     */
        
        
        int sayi=12345;
        int birlerbasmagi= sayi %10;
        System.out.println("birlerbasmagi = " + birlerbasmagi);
        int onlarbasamagi= (sayi/10)% 10;
        System.out.println("onlarbasamagi = " + onlarbasamagi);
        int yulzlerbasamagi=(sayi/100)% 10;
        System.out.println("yulzlerbasamagi = " + yulzlerbasamagi);
        int binlerbasamagi=(sayi/1000)%10;
        System.out.println("binlerbasamagi = " + binlerbasamagi);
        int onbinlerbasamagi=(sayi/10000)%10;
        System.out.println("onbinlerbasamagi = " + onbinlerbasamagi);

        System.out.print(onbinlerbasamagi+"\n"+binlerbasamagi+"\n"+onlarbasamagi+"\n"+birlerbasmagi);
}
}

