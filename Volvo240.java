import java.awt.*;

public class Volvo240 extends Car {

    /**
     * states what the trim factor is
     */
    private static double trimFactor = 1.25;

    /**
     * creates an object of type volvo240
     */
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240)");
        stopEngine();
    }

    /**
     * Determines the speed factor
     */
    double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}