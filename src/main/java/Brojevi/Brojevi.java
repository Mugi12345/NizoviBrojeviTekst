package Brojevi;

public class Brojevi {
    public static void main(String[] args) {
        int decVal = 26;
        int octVal = 032; //0 je prefix za oktalnu
        int hexVal = 0x1a; //0x je prefix za hexadekadnu
        int binVal = 0b11010; //0b je prefix za binarnu
        long creditCard = 1234_5678_9012_3456L; //da bi bilo citljivije ali kad se ispisuje u terminalu ne vide se donje crte

        Integer myNumber = 16; //boxing - stavljanje prostog tipa u odgovarajuci tip slozenog omotaca
        int primitiveNumber = myNumber; //unobixng - vracanje slozenog tipa omotaca u prosti tip

        Integer broj = 11;
        Integer broj2 = 16;

        System.out.println(broj.compareTo(broj2)); //da uporedimo jesu li isti brojevi, ako je rezultat -1 nisu isti, 0 ako jesu

        System.out.println(Integer.compare(13, 15));
        System.out.println(Integer.sum(10, 15));
        System.out.println(Integer.max(10, 15));
        System.out.println(Integer.min(broj, broj2));
        System.out.println();
        System.out.println(Math.abs(-15));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.signum(broj)); //da li je broj pozitivan ili negativan (1 ako je pozitivan -1 ako je negativan)
        System.out.println(Math.random()); //daje vrijednost jedno ili vece od 0 a manje od 1
        System.out.println();
        System.out.println(Math.round(5.4)); //zaokruzuje na manji
        System.out.println(Math.round(5.5)); //od .5 zaokruzuje na veci
        System.out.println(Math.round(5.6));
        System.out.println();
        System.out.println(Math.floor(5.4)); //zaokruzuje na manji broj
        System.out.println(Math.floor(5.5));
        System.out.println(Math.floor(5.9));
        System.out.println();
        System.out.println(Math.ceil(5.1)); //zaokruzuje na prvi sledeci broj
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.ceil(5.9));

    }
}
