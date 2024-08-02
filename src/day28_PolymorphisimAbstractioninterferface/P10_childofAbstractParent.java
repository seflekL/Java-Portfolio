package day28_PolymorphisimAbstractioninterferface;

public class P10_childofAbstractParent extends P09_abstractParent {
    //Abstaract bir silsilenden gelen ilk concerate class
    //parent abstract classta concreta edilmemis  tum abastrat methodlari override eder


    @Override
    public void method1() {
        System.out.println("concrete  child method1");
    }

    @Override
    public void method3() {
        System.out.println("concrete  child method3");

    }

    @Override
    public void method6() {


    }

    public static void main(String[] args) {
        P10_childofAbstractParent obj=new P10_childofAbstractParent();

        obj.method1(); //concrete  child method1

        obj.method2(); // kendisinde yoq abstract grand parent  method 2
        obj.method4();//abstract grand parent  method 2

        obj.method6(); //Buyuk papa calisti

        obj.method7(); //Abstract parent method7

    }
}
