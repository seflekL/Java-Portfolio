package Day24;

public class p04_RaporErisim {

    public static void main(String[] args) {


        P03_RaporClass obj = new P03_RaporClass();

        System.out.println(obj);


       //private yapinca satisTutari ve toplamsatis tutar private oldugu icin

         //Buarada devere encapsulation giriyor
        //encapusaltion devereye girmesi gerek

        System.out.println(obj.getSatisTutari());

        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(2000);



        System.out.println(obj.getToplamSatisTutari());
    }
}