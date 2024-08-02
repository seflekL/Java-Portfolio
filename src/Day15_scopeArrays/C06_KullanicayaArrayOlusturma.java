package Day15_scopeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullanicayaArrayOlusturma {

    public static void main(String[] args) {

        //Kullanidan arrayin boyunu ve elementlerini alip arrryi olusturun ve b
        //bize donduren bir method olusturun
        Arrays.toString(arrayOloustur());

    }
    public static int [] arrayOloustur(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Luitfen aary'in kac elmanli olacagini giriniz");
        int lenght =scan.nextInt();

        int [] arr= new int[lenght];

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i+".indexli elman icin bir deger giriniz..");

            arr[i]= scan.nextInt();

        }

        return arr;
    }

}
