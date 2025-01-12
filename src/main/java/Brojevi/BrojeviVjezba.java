package Brojevi;

import java.util.Scanner;

public class BrojeviVjezba {
    public static void main(String[] args) {


        System.out.println("Unesite poluprecnik: ");
        double r = new Scanner(System.in).nextDouble();
        double result = r*r*Math.PI;
        System.out.println("Povrsina kruga je: " + result);


    }
}
