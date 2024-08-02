package Day08_StringManipulation_testde_var;

public class P02_Equals {
    public static void main(String[] args) {

        String s1="Ali";
        String s2="ali";
        String s3="ALI";
        String s4="ALi";
        String s5="Ali ";
        String s6="Ali";
        String s7="ali";

        //equals methodu ile iki string deger karislastirirken case sensitive olarak
        //bakilir metinlerin ayni olup olamdigini bakarlar

        System.out.println(s1.equals(s2));//Ali---> degerler esit mi diye bakar
        System.out.println(s3.equals(s2));//ALI---> degerler esit mi diye bakar
        System.out.println(s3.equals(s4));//ALI---> degerler esit miAli ile bakar diye bakar
        System.out.println(s1.equals(s5));//ALI---> degerler esit miAli ile bakar diye bakar
        System.out.println(s1.equals(s6));//ALI---> degerler esit miAli ile bakar diye bakar

        System.out.println(" = =====================");

        System.out.println(s1.equalsIgnoreCase(s2));//ture vericek kuck //
                                                     // harf  olup olmamaisina bakam dedik
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s5));// bosluk nedeniyle false gelecektir
        System.out.println(s1.equalsIgnoreCase(s6));// boslugu  saymaz  sadece buyuk kuck harfe bakar




    }
}
