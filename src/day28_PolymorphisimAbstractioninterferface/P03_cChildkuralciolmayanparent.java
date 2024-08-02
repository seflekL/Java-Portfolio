package day28_PolymorphisimAbstractioninterferface;

public class P03_cChildkuralciolmayanparent extends P02_kuralciolmayamParent {


    /*
    Normal bir child class parent iliskisinde child class parent classdaki methodlardan
    istedigini direk parentaki haliyle kullanir
    istediginiz degistirip guncelleyip kullanir
    isterse  de parent da olmayan yeni bir method olusturabilir

     */

    public static void main(String[] args) {

        P03_cChildkuralciolmayanparent obj= new P03_cChildkuralciolmayanparent();

        obj.method1();


    }
}
