package Day15_scopeArrays;

public class Hemsire {
    public static void main(String[] args) {
        System.out.println("1-"+ Hastane.hastaneIsmi);
        System.out.println("========Personel Isim Listesi========");

        Hastane personel01=new Hastane();

        personel01.personalIsmi="Murat Babayigit";
        personel01.personalGorev="Hemsir";
        personel01.personalAdres="Uskudar";

        System.out.println(personel01.peronalAge);

    }
}
