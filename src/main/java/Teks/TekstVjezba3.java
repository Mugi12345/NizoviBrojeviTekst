package Teks;

public class TekstVjezba3 {
    public static void main(String[] args) {
        String users = "Name: John|Surname: Lord|Name: Ben|Surname: Torrance|Name: Tom|Surname: Ford";


        String[] usersArray = users.split("\\|");
//        for (int i = 0; i < usersArray.length; i++) {
//            System.out.println(usersArray[i]);
//        }m
        for (int i = 0; i < usersArray.length; i += 2) {
            String firstName = usersArray[i].split(" ")[1];
            String lastName = usersArray[i + 1].split(" ")[1];
            System.out.println("First name is: " + firstName + ", last name is: " + lastName);
        }
    }
}
