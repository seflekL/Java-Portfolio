package day28_PolymorphisimAbstractioninterferface;
//sadee bir class  extend yapabilirz
public class P16_childofmultipleParants
        extends P13_Parent implements P14InterfaceParent,P15_interfaceParent {
    @Override
    public void method2() {
        System.out.println("child class method2 ");

        //interface parent mutlaka method2 () olmali
        //interface oarebt2 method 2 olamali
    }

    @Override
    public void method3() {
        System.out.println("Child class method3");


    }

    public static void main(String[] args) {

        P16_childofmultipleParants obj= new P16_childofmultipleParants();

        obj.method1();
        obj.method2();
        obj.method3();

        System.out.println(P14InterfaceParent.sayi);
        System.out.println(P15_interfaceParent.sayi);

        System.out.println(yas);
        System.out.println(isim);

    }
}
