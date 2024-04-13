package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise3.FishFeeder;


public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int presetTemperature;
    private float presetLevel;
    private LevelSensor lvlSensor;
    private TemperatureSensor tempSensor;
    private Actuator alarm;
    private Actuator heater;
    private pHControl pH;

    public AquariumController(String manufacturer, String model) {
        FishFeeder feeder1 = new FishFeeder("Xeni", "45", 4);
        LevelSensor level1 = new LevelSensor("Afan", "S90", "l");
        TemperatureSensor t1 = new TemperatureSensor("Peso", "iL3", "C");
        Actuator alarm = new Actuator("Pluma", "123");
        Actuator heater = new Actuator("Mert", "GLC");
        this.manufacturer = manufacturer;
        this.model = model;
        this.feeder = feeder1;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if (this.currentTime == this.feedingTime) {
            System.out.println("The fish need food!");
            feeder.feed();
        }
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;

    }

    public boolean checkTemperature() {
        if (tempSensor.getValue() < presetTemperature) {
            heater.turnOn();
            System.out.println("Heater is on");
        } else if (tempSensor.getValue() == presetTemperature) {
            heater.turnOff();
            System.out.println("Heater is off");
        }
        return heater.getIsOn();
    }

    public boolean checkWaterLevel() {
        if (lvlSensor.getValue() < presetLevel) {
            alarm.turnOn();
            System.out.println("The alarm is on!");
        }
        return alarm.getIsOn();
    }

    public void ChangeWaterpH() {
        if (pH.getpH() > 8 && !alarm.getIsOn()) {
            this.pH.setpH(6);
        } else {
            this.alarm.turnOn();
        }
    }

    public void setPresetTemperature(int presetTemperature) {
        this.presetTemperature = presetTemperature;
    }

    public void setPresetLevel(float presetLevel) {
        this.presetLevel = presetLevel;
    }


}

