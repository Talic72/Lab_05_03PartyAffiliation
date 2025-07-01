import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your party affiliation in the form of R, D, OR I:");
        String inputChoice = in.nextLine();

        if(Objects.equals(inputChoice, "D")){
            System.out.println(" You get a democratic Donkey!");
        }
        else if(Objects.equals(inputChoice, "R")) {
            System.out.println(" You get a Republican elephant!");
        }
        else if(Objects.equals(inputChoice, "I")) {
            System.out.println(" You get a Independent Iguana!");
        }
        else {
            System.out.println(" You get the Other otter!");
        }
    }
}


