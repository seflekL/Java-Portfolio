package Day21_Mutable_ImmutableClasses;

public class P03_Stringpull {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Ali";
        String str3 = new String("Ali");
        String str4="A"+"li";
        String str5="A";
        String str6="li";
        String str7=str5+str6;
        String str8=str4.concat(str6);

        System.out.println(str1.equals(str2));//True Ali== Ali
        System.out.println(str1.equals(str2));//Truei
        System.out.println(str1.equals(str4));//Ali ali true
        System.out.println(str1.equals(str7));//True
        System.out.println(str1.equals(str8));//True
        System.out.println(str1.equals("Ali"));

        System.out.println("------------------------------------------");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1==str7);
        System.out.println(str1==str8);

    }
}
