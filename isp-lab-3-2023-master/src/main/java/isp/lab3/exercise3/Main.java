package isp.lab3.exercise3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[]args){
        Vehicle car1=new Vehicle("Audi","Q",200,'B');
        Vehicle car2=new Vehicle("BMW","albastru",400,'D');
        car1.setModel("Audi");
        System.out.println("Vehicle 1 model"+car1.getModel());
        car2.setModel("BMW");
        System.out.println("Vehicle 2 model"+car2.getModel());
        car1.setSpeed(200);
        System.out.println("Vehicle 1 speed"+car1.getSpeed());
        car2.setSpeed(400);
        System.out.println("Vehicle 2 speed"+car2.getSpeed());

        System.out.println("Are the two vehicles equal"+car1.equals(car2));

        Vehicle.displayNumberOfVehicles();
    }
}
