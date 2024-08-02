package java_addtional_practices;

import java.util.Scanner;

public class L06_Ternary_Operator_soru3 {

    public static void main(String[] args) {
//Kullanicadan vir harf isteyin girilern karakater kuck harf ise onu buyuk harf olarak yazdirin yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        String harf= scan.next();

        if (Character.isLowerCase(harf.charAt(0))){

            System.out.println(Character.toUpperCase(harf.charAt(0)));
        } else {

            System.out.println(harf);
        }
    }
}
