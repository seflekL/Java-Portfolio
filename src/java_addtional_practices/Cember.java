package java_addtional_practices;

public class Cember extends Sekil{
    public Cember(double yaricap) {
        super(yaricap);
    }


    @Override
    public String toString() {
        return " Cemberin yaricapi = " + yaricap + " Cemberin alani: "+alanhesaplama(yaricap)+ "-------"+
                " Cemberin cevresi: "+cevrehesaplama(yaricap);
    }
}