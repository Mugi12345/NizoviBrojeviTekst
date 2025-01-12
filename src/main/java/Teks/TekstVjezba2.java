package Teks;

import java.io.File;

public class TekstVjezba2 {
    public static void main(String[] args) {
        String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };

        for (int i = 0; i < files.length; i++) {
            if (files[i].endsWith(".jpg") || files[i].endsWith(".png") || files[i].endsWith(".gif"))
            System.out.println(files[i]); //samo treba podijeliti ovo u 3 if-a sa odgovarajucim porukama
        }

    }
}
