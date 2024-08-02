package Day11_forloopmethodcreation;

public class C01_forLoop_ahmethoca_ikibasamaklitoplami {
    public static void main(String[] args) {

        //iki basamakli pozitif tamsaylarin toplamini yazdirin

        int toplam=0;
        for (int i = 10; i <100 ; i++) {
            toplam +=i; //ikinci variable olustdum ki i  getirse toplama eklesin

        }
        System.out.println("iki basamakli sayilarin toplami toplam "+ toplam);

        //10 ile 50 araasinda ki * bolune bilen sayilari toplayin


        for (int j = 10; j <=50 ; j++) {
             toplam=0;
            if (j % 9==0 );
                toplam+=j;
            //sout hep parentez disina koy sen levent sout
        }
        System.out.println("toplamoplam 9 bolunerbilen sayuilar "+toplam);

        //2basakamakli pozitif ve negatif sayilarin toplami

        toplam=0;
        for (int i = -99 ; i <100 ; i++) { //arada negatif ve poztif rakalmar var
            if (!(i>-10 && i<10));
            toplam+=i;

        }
        System.out.println("iki basamakli butun sayilarin toplami "+ toplam );
    }

}

