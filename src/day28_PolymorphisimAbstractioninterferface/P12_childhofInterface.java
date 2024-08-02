package day28_PolymorphisimAbstractioninterferface;

public class P12_childhofInterface implements P11_interface { //interface olursa extedn yerine implent yapman gerek
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public int method5() {
        return 0;


    }

    public static void main(String[] args) {
        System.out.println(sayi);
        //  20
        //sayi=15; degistitmezsin interface de sayi final degerinde
        //interface icinde hersey final birdaha degistirlemez
        System.out.println(Math.PI);                                 //  3.141592653589793
        System.out.println(Integer.MAX_VALUE);                     //2147483647
        System.out.println(Short.MIN_VALUE);                       //-32768

    }
}
