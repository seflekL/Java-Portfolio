package Day21_Mutable_ImmutableClasses;

public class P02_StringBuilder {
    public static void main(String[] args) {
        String str2=new String("Murat");//String str2="Murat";
        System.out.println(str2);
        System.out.println(str2.toUpperCase());




        System.out.println(str2);

        StringBuilder str3=new StringBuilder("babayigit");// babayigit
        System.out.println(str3);
        str3.append("20240531");
        System.out.println(str3);////babayigit20240531
        System.out.println("Yeni Kullanici Dosya No  "+str3);
    }
}
