import java.awt.*;

public class Saab95 extends Car {

    /**
     * shows if the turbo is on or off
     */
    boolean turboOn;

    /**
     * creates an object of type Saab95
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        turboOn = false;
        stopEngine();
    }

    /**
     * Determines the speed factor
     */
    double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void setTurboOn(){
        turboOn = true;
    }
    public void setTurboOff(){
        turboOn = false;
    }



}