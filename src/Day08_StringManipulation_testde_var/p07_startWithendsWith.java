package Day08_StringManipulation_testde_var;

public class p07_startWithendsWith {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        //bu cumle ne ile basliyor?

        System.out.println(str.startsWith("J"));//true J ile basliyormu
        System.out.println(str.startsWith("Java"));//true Java ile basliyormu
        System.out.println(str.startsWith("Java "));//true Java ile basliyormu
        System.out.println(str.startsWith("Java gun "));//true Java gun  ile basliyormu
        System.out.println(str.startsWith("Java gun gectikce guzellesiyor"));//true butun hespini aliyor
        System.out.println(str.startsWith(""));//true gelir

        System.out.println(str.startsWith("g",5));//
        System.out.println(str.startsWith("e",9));//


        str="Java gun gectikce guzellesiyor";
        System.out.println(str.endsWith("yor"));//true yor ile bitiormu
        System.out.println(str.endsWith("y"));//True  hclik ile ile bitiormu
        System.out.println(str.endsWith("Java gun gectikce guzellesiyor"));//True  hclik ile ile bitiormu

















    }
}
