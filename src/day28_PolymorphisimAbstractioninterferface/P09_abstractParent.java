package day28_PolymorphisimAbstractioninterferface;

public abstract class P09_abstractParent extends P06_AbstractClassGP {

    //abstract bir classlari abstract baska bir class abstract child classlari tarafindan
    //abstract methdlarin override etmek zorunda degildir
    //eger kod yazan isterse overirde edebilir
    //eger kod yzan isterse override ederbilir

    public  abstract  void method1();

    @Override
    public void method2() {
        System.out.println("abstract grand parent  method 2");


    }
    public abstract void method3();

    public abstract void method6();

    public void method7(){
        System.out.println("Abstract parent method7");
    }
}
