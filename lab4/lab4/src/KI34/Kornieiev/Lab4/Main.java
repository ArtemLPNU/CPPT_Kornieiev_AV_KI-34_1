package KI34.Kornieiev.Lab4;

/**
 * Main class
 *
 * @author Kornieiev
 * @version 1.0
 */
public class Main {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        Tree tree = new Tree("Tree", 1, 16.4);

        tree.PrintInfo();
        System.out.println("---------------------------------------------");

        tree.GrowUp();
        System.out.println("---------------------------------------------");

        tree.PrintInfo();
        System.out.println("---------------------------------------------");

        tree.Wither();
        System.out.println("---------------------------------------------");

        tree.ToDropLeaves();
        tree.PrintInfo();

    }
}