package day25_encapsulation_inheritance;

public class P04_childClass extends P03_ParentClass {

      String isim="Child Class";
      String addrres="Child address";
      int yas=44;
      String  telefon;
    //bir class baska bir class parent extend edinebilir
    //Parent edindigingde genelde
    //1-Child class parent class daki tum ozelliklere sahip olur


    public static void main(String[] args) {

        P04_childClass child1=new P04_childClass();
//2- istedigniz ozllekleri child class gore guncelliyebilrisinin
        System.out.println(child1.isim);
        System.out.println(child1.ulke);



        //3-istersek parent class da olmaayn yeni ozellikler ekleyebilirz

        System.out.println(child1.telefon);
        System.out.println(child1.addrres);
    }


}
