import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // abbiamo un tot di fette di pane e formaggio
        // non sono della stessa quantità, non si sa
        // dobbiamo alternare una fetta di pane a una di formaggio

        // quando finiamo uno dei due ingredienti
        // dobbiamo stampare quanti ingredienti sono rimasti
        // e stampiamo anche la procedura di come facciamo sto sandwich

        Scanner in = new Scanner(System.in);

        System.out.println("\nLet's prepare some sandwiches...");

        System.out.print("\nEnter bread pieces quantity\n> ");
        int breadPieces = in.nextInt();

        System.out.print("\nEnter cheese slices quantity\n> ");
        int cheeseSlices = in.nextInt();

        prepare(breadPieces, cheeseSlices);
    }

    public static void prepare(int bread, int cheese) {
        String message = "Prepared a sandwich: ";

        while (min(bread, cheese) > 0) {
            bread--;
            cheese--;
            System.out
                    .println(message + bread + " remaining pieces of bread, " + cheese + " remaining slices of cheese");
        }

        if (bread == 0 && cheese == 0) {
            System.out.println("\n No ingredients are left.");
        } else if (bread == 0) {
            System.out.println("\n" + cheese + " slices of cheese are left.");
        } else {
            System.out.println("\n" + bread + " pieces of bread are left.");
        }
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
