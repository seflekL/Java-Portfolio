package Day11_forloopmethodcreation;

import java.util.Scanner;

public class P02_forloopmethod_Stersdenyazdirma {
    public static void main(String[] args) {
     /*
Kullanicdan bir sting isteyi ve string i tersten yazdirin
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        String tersCumle= scan.nextLine();

        for (int i = cumle.length(); i >1 ; i--) { //sonan basa geldigimden
                                                   // dolayi bir azalt

            tersCumle+= cumle.substring(i-1,i);

        }
        System.out.println(tersCumle);


    }
}



