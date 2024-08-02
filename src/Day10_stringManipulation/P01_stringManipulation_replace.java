package Day10_stringManipulation;

public class P01_stringManipulation_replace {
    public static void main(String[] args) {


        String str="Java Candir,Gerisi Heycandir";

       System.out.println(str.replace("a","A"));// JAVA CAndir Gerisi HeycAndir.
        //charSequence: charlar bir araya gelmesi olusan degerdir.charlar birlesirse string

        System.out.println(str.replace('a','A'));

        System.out.println(str.replace("Gerisi", "Selenium"));//Java Candir,Selenium Heycandir

        str="%,& Ahmet git 3 ekmek al! "; //%,& Ahmet git 3 ekmek al!
        System.out.println(str);//str terfi ettirdik yeni hali
        System.out.println(str.replaceFirst("\\w", "Me"));//%,& Mehmet git 3 ekmek al!
        System.out.println(str.replaceFirst("\\d","15")); //%,& Ahmet git 15 ekmek al!





   }
}
