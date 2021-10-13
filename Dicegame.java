/*Student 1:  
 Name: Pruthvi Sai Korupu
 Student Number: A00245392  

Student 2:  
 Name: Balaji Chandupatla  
 Student Number: A00245077 */

public class Dicegame {
    public static void main(String[] args) {

        System.out.println("Creating a default d6...");
        Die d6 = new Die();
        System.out.println("Creating a default d20...");
        Die d20 = new Die(20);
        System.out.println("reating percentile die (a special d10)...");
        Die d10 = new Die(10);
        System.out.println("The current side up for " + d6.getName() + " is " + d6.getSideUp());
        System.out.println("The current side up for " + d20.getName() + " is " + d20.getSideUp());
        System.out.println("The current side up for Percentile  is " + d10.getSideUp());

        System.out.println("\nTesting the roll method");
        System.out.println("Rolling the d6...");
        d6.roll();
        System.out.println("The new value is " + d6.getSideUp());
        System.out.println("Rolling the d20...");
        d20.roll();
        System.out.println("The new value is " + d20.getSideUp());

        System.out.println("Rolling the Percentile...");
        d10.roll();
        System.out.println("The new value is " + d10.getSideUp());

        System.out.println("\nSetting the d20 to show 20...");
        d20.setSideUp(20);
        System.out.println("The side up is now " + d20.getSideUp() + ". Finally.");


        Die[] dices = new Die[5];

        System.out.println("Creating 5 d6");
        for (int i = 0; i < dices.length; i++) dices[i] = new Die(6);
        int rolls = 0;
        do {
            for (int i = 0; i < dices.length; i++) dices[i].roll();

            rolls += 1;
        } while (dices[0].getSideUp() != dices[1].getSideUp() ||
                dices[0].getSideUp() != dices[2].getSideUp() ||
                dices[0].getSideUp() != dices[3].getSideUp() ||
                dices[0].getSideUp() != dices[4].getSideUp()
        );
        System.out.println("YAHTZEE! It took " + rolls + " rolls");

    }
}