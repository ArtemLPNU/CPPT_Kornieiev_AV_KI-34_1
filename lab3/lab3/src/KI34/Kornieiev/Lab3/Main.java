package KI34.Kornieiev.Lab3;

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

        Plant plant = new Plant("Plant", 1, 16.4);

        plant.PrintInfo();
        System.out.println("---------------------------------------------");

        plant.GrowUp();
        System.out.println("---------------------------------------------");

        plant.PrintInfo();
        System.out.println("---------------------------------------------");

        plant.Wither();
        System.out.println("---------------------------------------------");

        plant.PrintInfo();
    }
}
