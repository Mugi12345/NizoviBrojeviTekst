package Nizovi;

public class NizoviVjezba3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int x = 0;

//        while (x < array.length){
//            System.out.println(array[x]);
//            x++;
//        }

        do {
            System.out.println(array[x]);
            x++;
        } while (x < array.length);
    }
}
