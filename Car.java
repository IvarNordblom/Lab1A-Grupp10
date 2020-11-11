import java.awt.*;

/**
 *abstract super class which implements the Movable interface
 */
public abstract class Car implements Movable {

    /**
     *angle of the car, initially in +y-direction, private instance variable
     */
    private int angle = 0 ;

    /**
     *x-coordinate of car, package protected instance variable
     */
    private double x = 0;

    /**
     *y-coordinate of car, package protected instance variable
     */
    private double y = 0;

    /**
     *number of doors on the car, package protected instance variable
     */
    private int nrDoors;

    /**
     *engine power of car, package protected instance variable
     */
    private double enginePower;

    /**
     * current speed of the car, package protected instance variable
     */
    private double currentSpeed;

    /**
     * color of the car, package protected instance variable
     */
    private Color color;

    /**
     * name of the model, package protected instance variable
     */
    private String modelName;

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    /**
     * returns the number of doors of the car, package protected method
     */
    int getNrDoors(){ return nrDoors; }

    /**
     * returns the engine power of the car, package protected method
     */
    double getEnginePower(){ return enginePower; }

    /**
     * returns the current speed of the car, package protected method
     */
    double getCurrentSpeed(){ return currentSpeed; }

    /**
     * returns the color of the car, package protected method
     */
    Color getColor(){ return color; }

    /**
     * sets the colors of the car, package protected method
     * @param clr preferable color of the car
     */
    void setColor(Color clr){
        color = clr;
    }

    /**
     *abstract class which gets overridden in subclass
     */
    abstract double speedFactor();

    /**
     *returns the increment speed of the car, package protected method
     *@param amount the amount you want to increase
     */
    protected void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    /**
     *returns the decrement speed of the car, package protected method
     *@param amount the amount you want to decrease
     */
    void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    //Public methods below

    /**
     *starts the engine of the car
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * stops the engine of the car
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     *moves the car its current speed in its current direction
     */
    @Override
    public void move() {

        if(angle%4==0) y+=getCurrentSpeed() ;
        else if(angle%4==-2 || angle%4==2) y-=getCurrentSpeed() ;
        else if(angle%4==-1 || angle%4==3 ) x-=getCurrentSpeed() ;
        else x+=getCurrentSpeed() ;
    }

    /**
     *makes the car turn 90 degrees to the left
     */
    @Override
    public void turnLeft() {
        angle-=1;
    }

    /**
     *makes the car turn 90 degrees to the right
     */
    @Override
    public void turnRight() {
        angle+=1;
    }

    /**
     * increases the speed of the car
     * @param amount the amount you want to gas
     */
    public void gas(double amount){
        if(0 < amount && amount < 1){
            incrementSpeed(amount);
        }
    }

    /**
     * decreases the speed of the car
     * @param amount the amount you want to brake
     */
    public void brake(double amount){
        if(0 < amount && amount < 1){
            decrementSpeed(amount);
        }
    }

    /**
     * returns your current angle
     */
    public int getAngle(){ return angle ; }

    /**
     * returns your x-coordinate
     */
    public double getX(){
        return x ;
    }

    /**
     * returns your y-coordinate
     */
    public double getY(){
        return y ;
    }
}