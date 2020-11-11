import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;

public class CarTest {

    @Test
    public void testNrDoors() {
        Car Volvo = new Volvo240();
        assertEquals(4, Volvo.getNrDoors());
    }

    @Test
    public void testGetEnginePower(){
        Car Volvo = new Volvo240();
        assertEquals(100, Volvo.getEnginePower(), 0);
    }

    @Test
    public void testGetCurrentSpeed(){
        Car Volvo = new Volvo240();
        assertEquals(0.0, Volvo.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testStartEngine(){
        Car Volvo = new Volvo240();
        Volvo.startEngine();
        assertEquals(0.1, Volvo.getCurrentSpeed(), 0);
    }

    @Test
    public void testGetColor() {
        Car Volvo = new Volvo240();
        assertEquals(Color.black, Volvo.getColor());
    }

    @Test
    public void testSetColor() {
        Car Volvo = new Volvo240();
        Volvo.setColor(Color.green);
        assertEquals(Color.green, Volvo.getColor());
    }

    @Test
    public void testIncrementSpeed(){
        Car Volvo = new Volvo240();
        Volvo.incrementSpeed(1);
        assertEquals(Volvo.speedFactor(), Volvo.getCurrentSpeed(),1);
    }

    @Test
    public void testDecrementSpeed(){
        Car Saab = new Saab95();
        Saab.decrementSpeed(1);
        assertEquals(0, Saab.getCurrentSpeed(),0);

    }

    @Test
    public void testStopEngine(){
        Car Volvo = new Volvo240();
        Volvo.stopEngine();
        assertEquals(0, Volvo.getCurrentSpeed(),0);
    }

    @Test
    public void testMove(){
        Car Volvo = new Volvo240();
        Volvo.move();
        assertEquals(0.1, Volvo.getY(), 1);
    }

    @Test
    public void testTurnLeft(){
        Car Volvo = new Volvo240();
        Volvo.turnLeft();
        assertEquals(-1, Volvo.getAngle());
    }

    @Test
    public void testTurnRight(){
        Car Volvo = new Volvo240();
        Volvo.turnRight();
        assertEquals(1, Volvo.getAngle());
    }

    @Test
    public void testGas(){
        Car Volvo = new Volvo240();
        Volvo.startEngine();
        Volvo.gas(0.3);
        assertEquals(0.4, Volvo.getCurrentSpeed(),1);
    }

    @Test
    public void testBrake(){
        Car Volvo = new Volvo240();
        Volvo.startEngine();
        Volvo.gas(1);
        Volvo.brake(0.1);
        assertEquals(1,Volvo.getCurrentSpeed(),1);
    }

    @Test
    public void testTurboOn() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertEquals(true,saab.turboOn);
    }

    @Test
    public void testTurboOff(){
        Saab95 Saab = new Saab95();
        Saab.setTurboOff();
        assertEquals(false,Saab.turboOn);
    }

    @Test
    public void testGetX() {
        Car Volvo = new Volvo240();
        assertEquals(0, Volvo.getX(),0);
    }

    @Test
    public void testGetY() {
        Car Volvo = new Volvo240();
        assertEquals(0, Volvo.getY(),0);
    }

    @Test
    public void testGetAngle() {
        Car Volvo = new Volvo240();
        Volvo.turnLeft();
        assertEquals(-1, Volvo.getAngle(),0);
    }
}
