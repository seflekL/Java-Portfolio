package java_addtional_practices;

public class L13_arrays_soru2 {


    static int [] array=new int[] {1,2,3,4,5,6,7,9,10,12,24,36,42,55,100};

    static  int toplam=0;

    public static void main(String[] args) {

        /*
        Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz.
         */

             int[] arr={-2,3,4,-5,5,-3,-6,-7};
            System.out.println(arraydekiPozitifSayilariTopla(arr));
        }

        private static int arraydekiPozitifSayilariTopla(int[] arr) {
            int toplam=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>0){
                    toplam+=arr[i];
                }
            }
            return toplam;

        }
    }




