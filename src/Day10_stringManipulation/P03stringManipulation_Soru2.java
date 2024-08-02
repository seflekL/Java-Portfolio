package Day10_stringManipulation;


public class P03stringManipulation_Soru2 {

    public static void main(String[] args) {

        /*
        ullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €
         */

        String input1="15.30 €";

        String input2="11.40 €";
        double deger1=Double.parseDouble(input1.replace("€", ""));
        double degeri2=Double.parseDouble(input2.replace("€","" ));

       double toplam=deger1+degeri2;

        System.out.println("Toplam:"+toplam +"€");
        System.out.println("Toplam:"+Double.toString(toplam) +"€");


    }
}
