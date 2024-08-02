package Day18_Constructor;

public class P03_codeInstructor {

    String name="Atanmadi";
    String address = "Girilmedi";
    int age;


    P03_codeInstructor (){
        age=40;
    }
    P03_codeInstructor(int age){
        age=30;
        address="Uskudar";
    }

    P03_codeInstructor(String name,String address){
        this.name=name;
        this.address=address;

        //kodual hocdan

    }

}
