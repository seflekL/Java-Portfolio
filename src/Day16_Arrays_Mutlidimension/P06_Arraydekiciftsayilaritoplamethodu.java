package Day16_Arrays_Mutlidimension;

public class P06_Arraydekiciftsayilaritoplamethodu {

    public static void main(String[] args) {
        //Soru:Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        //        sonucu yazdiran bir method olusturun.

        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};

        System.out.println(ciftOlanlariTopla(arr));

    }

    public static int ciftOlanlariTopla(int[][] arr) {

        int ciftSaylarinToplami=0;

        for (int i = 0; i < arr.length; i++) { //outer array
            for (int j = 0; j < arr[i].length; j++) { //inner arrays
                if (arr[i][j]%2==0){
                    ciftSaylarinToplami+=arr[i][j];
                }
            }
        }
        return ciftSaylarinToplami;
    }
}