import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cave = {
                "the treasure",
                "a rock",
                "some swords",
                "a spiderweb",
                "a chestplate",
                "a teapot",
                "some emeralds"
        };
        String goal = "the treasure";

        explore(goal, cave);
    }

    public static void explore(String goal, String[] cave) {
        boolean doesGoalExist = false;

        for (int i = 0; i < cave.length; i++) {
            if (cave[i].equals(goal)) {
                doesGoalExist = true;
            }
        }

        if (doesGoalExist) {
            ArrayList<String> objectsFound = new ArrayList<>();
            Random r = new Random();
            int randNum = cave.length - 1;

            System.out.println("\nEntering the cave...\n");
            while (goal != cave[randNum]) {
                objectsFound.add(cave[randNum]);
                System.out.println("found " + cave[randNum]);

                // random number between 0 - 4
                randNum = r.nextInt(cave.length);
            }
            System.out.println("\nHow lucky! I found " + goal);
            System.out.println("Going back!");

            System.out.println("\nLet's recap, I found:");
            for (int i = 0; i < objectsFound.size(); i++) {
                System.out.println("- " + objectsFound.get(i));
            }
            System.out.println("\nBye!\n");
        } else {
            System.out.println("\n'" + goal + "' doesn't exist...");
        }

    }
}
