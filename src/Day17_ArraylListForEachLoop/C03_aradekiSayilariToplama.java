package Day17_ArraylListForEachLoop;

public class C03_aradekiSayilariToplama {
    public static void main(String[] args) {

        //verilen integer bir arraydeki tum tek sayilari toplayip yazidirin

        int [] sayilar ={3,5,6,7,3,1,2,6,5,4 };

        int toplam=0;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar [i] % 2 !=0  ){
                toplam +=sayilar[i];
            }

        }
        System.out.println(toplam);  //24

        toplam=0;

        for (int j : sayilar) {  // J bana sayilar arraydein deki heribir J.
            // ) int'i getir.

            if (j % 2 != 0) {
                toplam += j;
            }

        }
        System.out.println(toplam);  //24
    }
}
