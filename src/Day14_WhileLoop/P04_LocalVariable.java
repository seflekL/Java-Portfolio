package Day14_WhileLoop;

public class P04_LocalVariable {
    public static void main(String[] args) {

        String str = "Suslu parenteze dikkat";
        System.out.println(str);


        for (int i = 0; i < 10; i++) {
            boolean bl = true;
            System.out.println("bl = " + bl);
            System.out.println(i);
            System.out.println(str);
            str = "merhaba";

        }
        System.out.println(str);
        String s;
        int a;
        char k;
        //System.out.println(s);
        //a++; tanimlamadinonce tamimlanan lazim
    } //Local variable

public void method1 () {
    //System.out.println(str);
    int sayi=30;
    System.out.println(sayi);
}
public static void method2(){
        char ch='a';

}
}