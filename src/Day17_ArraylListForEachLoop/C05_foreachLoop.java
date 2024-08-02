package Day17_ArraylListForEachLoop;

public class C05_foreachLoop {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 1,2};


        karelerinToplami(arr);
    }

    public static void karelerinToplami (int [] sayilar){

        int toplam= 0;

        for (int each : sayilar) {

            toplam += each*each;

        }
        System.out.println("Array deki sayilarin karelerin toplami  "+toplam);
    }
}
