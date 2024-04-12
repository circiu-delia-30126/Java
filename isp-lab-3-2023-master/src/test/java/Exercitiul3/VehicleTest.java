package Exercitiul3;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test

    public void TestToString(){
        Vehicle vehicle = new Vehicle("Mercedes","Alb",200,'D');
    assertEquals("Mercedes (Alb) speed 200 fuel type D",vehicle.toString());
    }
}
