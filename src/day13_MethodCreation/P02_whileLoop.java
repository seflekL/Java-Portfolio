package day13_MethodCreation;

public class P02_whileLoop {
    public static void main(String[] args) {
        //Baslangic ve bitis degerleri  belli olan ve artis miktari sbit olan donulerde 
        //forloop kullainir
        System.out.println("--------------Islem for looop ile yapalim");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(" " + i);
        }

        System.out.println("----------Ayni islemi While Loop ile Yapalim");
        int i=1;

        while (i<=10){

            System.out.print(i+" "); //sonuz kere yazmaz

            i++;

        }

    }
}
