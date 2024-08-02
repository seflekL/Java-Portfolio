package Day08_StringManipulation_testde_var;

public class p03_Equals_doubleEqualsSign {
    public static void main(String[] args) {


   String s1="Ali";
   String s2="Ali";
   String s3=new String("Ali");
   String s4="Al"+"i";
   String s="A";
   String t="li";
   String s5=s+t;



   //equals yerine == operatoru olursa
        // variable lar karsilastirlirken hem metne hem refans bakar

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false verecek
        //bir string olustur refarans Ali olsun diyoruz s3
        System.out.println(s1==s4);//true verecektir
        System.out.println(s1==s5);//false verecektir

        //equals() ve equalignorecase () bu methodlar saece metine bakar

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));//true verecektir
        System.out.println(s1.equals(s5));//true verecektir
        System.out.println("=====================================================");
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));// true
        System.out.println(s1.equalsIgnoreCase(s4));//true verecektir
        System.out.println(s1.equalsIgnoreCase(s5));//true verecektir//boslugu algilama
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
