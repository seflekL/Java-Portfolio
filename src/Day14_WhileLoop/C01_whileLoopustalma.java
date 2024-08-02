package Day14_WhileLoop;

public class C01_whileLoopustalma {



    public static void main(String[] args) {
 /*
    Kullanidan bir sayi hesapmak istedigi ussunu itesyin
    while loop kullanarak verilen sayinin istenen ussunu hesaplayin yazidrin
    bir methhod olusuruun
     */
ustAL(2, 3);


    }
        public static void ustAL(int sayi, int pozitifus){
            //2 uzeri us hesapla ===>2*2*2*2==>16
            int sonuc = 1;
            int hesaplanacakus=0;
            while (hesaplanacakus>0){
                sonuc *= sayi;
                hesaplanacakus--;

            }
            System.out.println(sayi+"uzeri"+pozitifus+"= " + sonuc);
        }



}
