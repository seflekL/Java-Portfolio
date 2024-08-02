package Day10_stringManipulation;

public class p05_forLoop {

    public static void main(String[] args) {

        //1den baslayip 10' a kadar olan sayilari tek tek yazdirsin

      for (int i= 1; i <=10 ; i++){
          System.out.print(i+ " ");


      }


      //basakamkli cift sayialri yazdiralim

        for (int i = 10; i <100 ; i+=2){  // iki basamakli sayilari yazdirmak icin

            System.out.println(i+" ");
        }

        for (int i = 0; i >-10 ; i--) {
            System.out.println("+i"+i);
        }

        //3 basasmakli sayi 100-500 sayilardam  17 boleleim yadir ik
        for (int i = 100; i <500 ; i++) { //ikinci bir if lazim gideken yolda boluyor

            if (i%17==0){   //17 bolenleri yazdir dedim
                System.out.print(i+" ");

            }

        }
        System.out.println();// bosluk birakabilmek icin for loop  suslu prentezzin disina
                             //yoksa cok bosluk birakircikmalisin
    }
}

