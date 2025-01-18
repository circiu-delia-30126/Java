import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q tu quit.");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");

        }
        else {
            System.out.println("You quit the game!");
        }
        }
        }

