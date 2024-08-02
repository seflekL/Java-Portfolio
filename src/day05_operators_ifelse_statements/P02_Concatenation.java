package day05_operators_ifelse_statements;

public class P02_Concatenation {
    public static void main(String[] args) {

        /*
        Sting data turunun yanina + isareti ile bir baska data turude variable
        eklenirse sonuc  herzaman stirng olacaktir string baskindir

        Matemaiksel islmerde iceriyorsa matematiksel islem onceliklerini dikkate alir

         */

        String a="Hello";
        String  b="Yapragim";
        int c=5;
        int d=3;

        System.out.println(a+b);// HelloWorld
        System.out.println(a+ " " + b);// Hello World
        System.out.println(" "+c+d);//53
        System.out.println(""+ c*d);//15 15 string lan 15dir parese etmeden olmaz
        //int f=Integer.parseInt(""+ c*d);

        System.out.println(a+(c*d)); //Hello15
        System.out.println(a+b+c);   //helloworld5

        //soru cozumu

        System.out.println("-------Soru cozumu-------");

        String s1="Java";
        String s2=" ";
        String s3="kolay";
        String s4="";//nothing

        int x=4;
        int y=3;

        System.out.println(x*y+s2+s3+s2+s3);// 12 Java Kolay

        System.out.println(x+y+s2+s1+s2+s3);// 7 Hava Kolay

        System.out.println(s1+s2+s3+s2+x+y);//Java kolay 43 yazacaiktir  islemde sonda kaldi

        System.out.println(s4+y+x+s1+s2+s3);//34 java elde elde edebilmek icin s4 ile bosluk birakip ilk islemin toplama olmasini
        // engelliyors s4 nbuyuzden baa aldik ki 34 java yazsin


    }
}

