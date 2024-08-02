package Day11_forloopmethodcreation;

public class forloop_ahmethoca_basic {
    public static void main(String[] args) {
        
        
        //1 den 100 kadar dahil olsin


        for ( int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");
            
        }
        System.out.println("");// bir alat satira gecmesi icin susluden ciktik

        //34- balsayarak 3' er 3 l;er  artirairak  iki bsamakli sayilari
        //100 den kucuk olan 100 haric sayilari yazidirin


        for (int i = 34; i <100 ; i+=3) {
            System.out.print(i+" ");

        }

        System.out.println();
        //iki basamakli sayilardan 7 ile bolnebilerler yazidirizn

        for (int i = 10; i <100 ; i++) {
            if (i % 7==0);

            System.out.print(i+ " ");

        }
    }
}
