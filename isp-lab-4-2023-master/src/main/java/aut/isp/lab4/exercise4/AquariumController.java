package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.FishFeeder;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private Lights lights;
    private boolean status;
    private float LightsTime;

    public AquariumController(String manufacturer, String model) {
        FishFeeder feeder1=new FishFeeder("Xiaomi","A12",5);
        Lights light1=new Lights();
        light1.setStatus(true);
        this.feeder=feeder1;
        this.manufacturer = manufacturer;
        this.model = model;
    }

   public boolean getStatus(){ return status;}

    public void setCurrentTime(float CurrentTime){
        this.currentTime=currentTime;
        if(this.currentTime==this.feedingTime) {
            System.out.println("The fish needs foos!");
            feeder.feed();
        }
        if(this.currentTime==8+this.LightsTime){
            System.out.println("Turn off the lights!");
            lights.turnOff();
        }
    }

public void setLightsTime(float lightsTime){
this.LightsTime=lightsTime;
lights.turnOn();
}
    public float getCurrentTime() {
        return currentTime;
    }


    public float getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }


    @Override
    public String toString() {
        return "AquariumController{" +
                "feeder=" + feeder +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                ", lights=" + lights +
                ", status=" + status +
                ", LightsTime=" + LightsTime +
                '}';
    }
}
