package Day11_forloopmethodcreation;

public class C05_ForLoop_DIKKAT_EDILECEK_KONULAR {

    public static void main(String[] args) {


        for (int i = 10; i <0 ; i++) {  //10 sifirdan kucuk olduguicin loop baslamdn biter
            System.out.println(i); //i'ye atanan ilk deger icin
                                    //loop body calisma sarti false oluyorsa
                                    //loop body si hic calismadan lioop biter



        }
        //i nin degisimi ile hib bir zman
        //loop sartu false olmuyorsa buna sonsuzluk dongusu denir
        for (int i = 0; i <10 ; i--) {
            System.out.println(i);

        }
    }
}
