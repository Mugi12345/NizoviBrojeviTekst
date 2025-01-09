public class NizoviVjezba {
    public static void main(String[] args) {
        int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23, 934, 999, 43};


        System.out.println(searchArray(array, 12));
        System.out.println(searchArray(array, 999));

    }
//
//    private static boolean searchArray(int[] array, int key) {
//
//        for (int value : array) {
//            if (value == key)
//                return true;
//        }
//
//        return false;
//    }
        public static boolean searchArray(int[] array, int key){
            for (int value : array){
                if (value == key)
                    return true;
            }
            return false;
        }

}
