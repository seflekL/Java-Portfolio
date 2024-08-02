package day27;

public class P05_childClass extends P04_parentClass {

    String isim="Parent isim";
    String telefon="Parent telefon";
    int kilo=74;
int yas=100;

    public void method1 (){

        System.out.println("Child method 1");
    }

    public void method2 (){

        System.out.println("Child method 1");


    }
    public void method3(){
        System.out.println("Child Method3 ");
    }
    public void method4(){
        String adress="Method adres";
        int yas=40;
        System.out.println(yas);
        System.out.println(adress);
    }

    public static void main(String[] args) {


        P05_childClass obj=new P05_childClass();


    }
}

