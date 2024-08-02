package java_addtional_practices;

public class C03_Asallarintoplami {
    public static void main(String[] args) {
        //2- verilen bir arraydake ki asal sayilari toplayin

        int[] arr = {13,6,8,5,17,21,23,25,37,39};

        int asallarinToplam=0;

        //for each loop ile cozelim

        for (int each : arr){
                    //c07  methoduna . salami  icinsonucu true veya false verir
          if (C07_AsalMiMethodu.asalMi(each)== true){ //eger gelen sayi asal sayi ise bende
              //asalsayialrin toplmainia eklerim
              asallarinToplam+=each;

          }
        }// for each bittigi yerde toplarim
        System.out.println("Asal sayilarin toplami "+ asallarinToplam);

    }
}
