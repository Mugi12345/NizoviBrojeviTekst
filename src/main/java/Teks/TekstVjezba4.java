package Teks;

public class TekstVjezba4 {
    public static void main(String[] args) {
        String[] forbidenChars = { "<", ">", "'" };
        String input = "<div>my 'div' tag</div>";

        String output = input;
        for (int i = 0; i < forbidenChars.length; i++) {
           output = output.replace(forbidenChars[i], "");
        }
        System.out.println(output);


    }
}
