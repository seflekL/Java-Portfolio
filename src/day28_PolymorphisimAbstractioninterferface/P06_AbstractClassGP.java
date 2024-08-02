package day28_PolymorphisimAbstractioninterferface;

public abstract class P06_AbstractClassGP {
     //method 1 ve method 2 abstract methodu
    public abstract void method1();

    public abstract void method2();
    //concrete methodlar 3 ile 4
    public void method3(){
        System.out.println("AbstractGP mehtod3 calisti");
    };

    public void method4(){
        System.out.println("Buyuk papa calisti");
    };
}
