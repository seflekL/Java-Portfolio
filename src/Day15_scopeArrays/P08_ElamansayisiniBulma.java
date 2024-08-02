package Day15_scopeArrays;

public class P08_ElamansayisiniBulma {
    public static void main(String[] args) {

        //Verilen bir arrayde
        //istenen bir elamini var olmuadigini
        //varsa kac kere kullandigini yazdiran bir method olusturun.

        int[] arr = {3,4,5,1,2,4,6,7,4,3,2,5,6,7,8,1,2,3,4,5};

        elamanSayisiniYazdir(arr, 3);
        elamanSayisiniYazdir(arr, 8);
        elamanSayisiniYazdir(arr, 2);
    }

    public static void elamanSayisiniYazdir(int[] arr, int arananEleman) {

        int flag=0; // kackere oldugunu bileiblmek icin

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananEleman) {
                flag++;

            }

        }
        if (flag==0){
            System.out.println("Aranan eleman verilen arrayde yoktur");
        }   else {
            System.out.println("Aradiginiz eleman olan  "+ arananEleman +"verilen array de  "+flag+" adet varridr");
        }
    }
}
