package KI34.Kornieiev.Lab3;

import java.util.Random;

/**
 * Class Branch
 *
 * @author Kornieiev
 * @version 1.0
 */
public class Branch {

    private double length;
    Logger logger = Logger.getLogger();

    /**
     * Constructor
     */
    public Branch() {
        logger.log(logger.infoFlag + "Branch constructor was called");
        Random random = new Random();
        this.length = random.nextDouble();
    }

    /**
     * Getter for length
     * @return
     */
    public double getLength() {
        logger.log(logger.infoFlag + "Branch getLength was called");
        return length;
    }

    /**
     * Setter for length
     * @param length
     */
    public void setLength(double length) {
        logger.log(logger.infoFlag + "Branch setLength was called");
        this.length = length;
    }

    /**
     * Method GrowUp
     */
    void GrowUp() {
        logger.log(logger.infoFlag + "Branch GrowUp method was called");
        Random random = new Random();
        double grow = random.nextDouble();
        this.length +=  grow;

        System.out.println("Branch grow up " + grow + "s.");
    }

    /**
     * Method to print info
     */
    void PrintInfo() {
        logger.log(logger.infoFlag + "Branch PrintInfo method was called");
        System.out.println("Branch { length: " + length + "s. }" );
    }
}
