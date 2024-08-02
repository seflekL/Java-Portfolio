package Day14_WhileLoop;

public class C01_stringTerse_cevir {
    public static void main(String[] args) {
        System.out.println(metiniTersecevir("Ali topu tut."));

    }

    public static String metiniTersecevir (String metin){

        //Ali toputut

        int index =metin.length()-1;
        String tersMetin="";

        while(index>=0){
            tersMetin+=metin.charAt(index);

            index--;


        }
        return tersMetin;
    }
}
