package aut.isp.lab4.exercise5;

public class Alarm extends Actuator {

    public Alarm(String manufacturer, String model) {
        super(manufacturer, model);//the word"super"is used to call a method from the upperclass
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
