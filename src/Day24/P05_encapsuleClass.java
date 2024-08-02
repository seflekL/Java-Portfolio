package Day24;

public class P05_encapsuleClass {

    private String studenName="Not asssigned  ";
    private String Schoolname="Beylerbeyi Lisesi";
    public String schooladdess;
    private String phonenumber;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSchoolname() {
        return Schoolname;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public String getStudenName() {
        return studenName;

        //write and read yetkisni sinirlamak icin
        //access modifier ile private variale olusturlur
        //daha sonra vermek istedimiz yetki icin
        //getter setter metodlarindan faydalniriz

    }
}
