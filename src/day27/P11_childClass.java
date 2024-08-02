package day27;

public class P11_childClass extends P10_Parent{

    //Biz ayni clss da method olustrurabilirmizyi method olusturulamaz
    //Bir methodun ovverride edilebilmesi icin methodun child class da olusturulmasi lazim
    //ayni zamanda parent class da ki signuture ile ayni olmasi gerekir


    public void method1(int a){
        //methodun isminin ayni olmasi override icin yeterli degildir
        //signuturelarein da ayni olmasi gerekir

    }

    @Override
    public void method1() {
        //Override olmasbilmesi Access odfider, return type da ayni olmalidir

    }
}
