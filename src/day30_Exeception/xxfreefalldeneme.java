package day30_Exeception;

import java.util.InvalidPropertiesFormatException;

public class xxfreefalldeneme {

    public static void main(String[] args) throws InvalidPropertiesFormatException {

        maildogrula("ab@gmai1.com");

    }

    public static void maildogrula(String eMail) throws InvalidPropertiesFormatException {

        if (eMail.contains("@gmail.com" )|| eMail.contains("@hotmail.com")){

            System.out.println(eMail);
        }else {
            throw new InvalidPropertiesFormatException("Email adresi uygun degil");
        }
    }
}