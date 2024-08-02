package day09_StrigManipulation;

public class P04_isEmpteyisBlank {
    public static void main(String[] args) {



        String str1="";
        String str2=" ";
        String str3="        ";
        String str4="    .    ";

        System.out.println(str1.length());//0 bosluk olmamamsi
        System.out.println(str2.length());//1
        System.out.println(str3.length());//8
        System.out.println(str4.length());//9


        //is empty methodu sting ifadenin icindeherhan bir sey var mi yokmu ona bakar.
        //eger hicbirsyey yoksa(leght ==0) ise true veri bosluk dahil  herhangi bir karekter var ise
        //karekter varsa ise false veriri

        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false
        System.out.println(str3.isEmpty());//false
        System.out.println(str4.isEmpty());//false

        //isblank() methodu icinde ki bosluk karrakteri haric icinde birsey var mi die bakar

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true
        System.out.println(str3.isBlank());//true
        System.out.println(str4.isBlank());//false

    }
}
