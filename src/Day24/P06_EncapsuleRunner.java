package Day24;

public class P06_EncapsuleRunner {
    public static void main(String[] args) {

        P05_encapsuleClass obj=new P05_encapsuleClass();
        
        //hivr bir getter veya setter islemi yapmadan sadece
        //adrese ulasabilir ve degistrebilrim 
        
        obj.schooladdess="Uskudar";

        System.out.println("obj.schooladdess = " + obj.schooladdess);
        System.out.println(obj.getStudenName());
        obj.setStudenName("Murat");
        System.out.println("obj.getStudenName() = " + obj.getStudenName());
        System.out.println(obj.getSchoolname());
        obj.setPhonenumber("5325555555");

        System.out.println("obj.getPhonenumber() = " + obj.getPhonenumber());
    }
}
