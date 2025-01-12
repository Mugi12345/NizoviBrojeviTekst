package Nizovi;

import java.util.Arrays;

public class Nizovi {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 23;
        numbers[1] = 46;
        numbers[4] = 100;
//        for (int i =0; i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 23));
        System.out.println("");
        // int[] numbers1 = new int[]{1,2,3,5,8,77}; ovako nesto koristimo kad unaprijed znamo clanove niza
        int[] numbers1 = {1, 2, 3, 5, 8, 77}; //najjednostavniji nacin pisanja niza
        System.out.println(Arrays.toString(numbers));


        System.out.println(Arrays.toString(numbers1));
        System.out.println("");
        int[] destArray = new int[numbers.length + numbers1.length];
        System.arraycopy(numbers, 0, destArray, 0, numbers.length); //kopiranje prvog niza u destArray
        System.arraycopy(numbers1, 0, destArray, numbers.length, numbers1.length); //kopiranje drugog niza u destArray
        System.out.println(Arrays.toString(destArray));


        System.out.println("");
        Object[] brojevi = {1, 5.5, 7.3, 8, 111, "Hello world"}; //kada imamo vise varijabli int,double...
        System.out.println(Arrays.toString(brojevi));
        System.out.println(brojevi[5]);
        System.out.println(brojevi.length);

    }
}
