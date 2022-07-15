package Project1;
import java.util.*;
public class Project1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String userName = keyboard.nextLine();
        System.out.println("How many kittens do you have " + userName +"?: ");
        int kittensOwned = Integer.parseInt(keyboard.nextLine());
        System.out.println("What is the average weight of the kittens " + userName +"? (In grams, Average weight per kitten): ");
        double averageWeight = Double.parseDouble(keyboard.nextLine());
        averageWeight = averageWeight / 100;
        int count = 0;
        double formulaNeeded = 0;
        double wetFood = 0;

        while (count < kittensOwned) {
            System.out.println("How old are your kittens " + userName +"? (In weeks): ");
            int kittenAge = Integer.parseInt(keyboard.nextLine());
            if (kittenAge < 5) {
                formulaNeeded += averageWeight * 5;
            } else if (kittenAge > 8) {
                wetFood += 100;
            } else if (kittenAge >= 5 && kittenAge<=8) {formulaNeeded += 20; wetFood += averageWeight * 10;}
            count += 1;
        }
        System.out.println("Your kittens will require " + (formulaNeeded*7)+"mL of formula and " + (wetFood*7) +"g of wet food a week!");
    }
}
