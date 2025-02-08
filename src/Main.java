import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String partyAffiliation = "";
        System.out.println("What party do you affiliate with? (Choose D, R, I, or O) ");
        Scanner in = new Scanner(System.in);
        partyAffiliation = in.nextLine().toUpperCase();
        if (partyAffiliation.equals ("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyAffiliation.equals ("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (partyAffiliation.equals ("I")) {
            System.out.println("You get a Independent Man!");
        }
        else if (partyAffiliation.equals ("O")) {
            System.out.println("You get some other thing!");
        }
        else
        {
            System.out.println(partyAffiliation + " is not a valid input! Rerun the program and try again!");
        }
    }
}