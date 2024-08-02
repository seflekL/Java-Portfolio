package day28_PolymorphisimAbstractioninterferface;

public interface P11_interface {

    //full abstraction saglamak amaci ile kullanir
    //bu nedenle tum  metdholar publc ve abstract dir.
    //interface icinde tum variablar final static ve public
    /// Tum methodlar ise public ve abstractir.
    public abstract void method1(); //Modifier 'public' is redundant for interface members  gerekeiz bisiye zaten

    public void method2();
    abstract void method3();

    void method4();

    int sayi = 20;//yapamazszin sayi vermen gerekir

  int method5();

}
