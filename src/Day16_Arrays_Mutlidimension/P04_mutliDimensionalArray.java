package Day16_Arrays_Mutlidimension;

import java.util.Arrays;

public class P04_mutliDimensionalArray {

    public static void main(String[] args) {

        int [] [] arr={{1,2,3},{5,12},{15,23,69,100}};

        ///index hep sifr 0       1     2
        System.out.println(arr[1][0]);  //5
        System.out.println(arr[2]);// refeansini karslsini yzadirir [I@1d251891
        System.out.println(Arrays.toString(arr[2]));// ikinci kumeyi yazicak
        System.out.println(Arrays.deepToString(arr));
    } 
}
