package Teks;

public class Tekst {
    public static void main(String[] args) {
        String message = "Hello"; //implicitni - string pull
        System.out.println(message.length());
        System.out.println();
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
//        for (char aChar : chars) {
//            System.out.println(aChar);
//        }

        System.out.println();
        String message2 = new String("Hello!"); //eksplicitni - kreira se uvjek novi string
        String message3 = new String("Hello!");
        System.out.println(message2 == message3); //false
        System.out.println(message2.equals(message3)); //true
        System.out.println();
//        String text = "Hello ";
//        String text2 = "world";
//        System.out.println(text.concat(text2));
//        text.concat("world); dace rezultat samo "Hello" jer se sa ovim concat kreira sasvim novi String

        StringBuilder text = new StringBuilder();
        text.append("Hello ");
        text.append("world");
        System.out.println(text);
        System.out.println();

        String string = "HelLo WoRlD       ";
        String subString = "WoR";
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.trim().toUpperCase());
        System.out.println(string.indexOf('r')); //nema malog slova r
        System.out.println(string.indexOf('R'));
        System.out.println(string.indexOf('l',7));
        System.out.println(string.indexOf(subString));
        System.out.println(string.substring(2));
        System.out.println(string.substring(3, 8));
        System.out.println(string.startsWith("Hello"));
        System.out.println(string.startsWith("HelLo"));
        System.out.println(string.startsWith("Lo",3));
        System.out.println(string.endsWith("lD"));
        System.out.println(string.endsWith(" "));
        System.out.println(string.replace(" ","*"));
        System.out.println();

        String string1 = "This-is-String";
        String[] array1 = string1.split("-");
        //broj sluzi koliko clanova ce da nam ima niz,
        // ako ne stavimo broj podijelice sve rijeci
        for (String value : array1) {
            System.out.println(value);
        }

        System.out.println();
        String s = "This is String";
        char char1 = s.charAt(2);

        System.out.println(char1);
        System.out.println();


        String s1 = "This is String. Or is it?  Yes, it is! Good job.";
        String[] array2 = s1.split("[ .,?!]+");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }



    }
}
