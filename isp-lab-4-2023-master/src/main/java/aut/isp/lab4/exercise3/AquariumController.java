package aut.isp.lab4.exercise3;

public class AquariumController {
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;

    public AquariumController(FishFeeder feeder, String manufacturer, String model) {
        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
    }
public void setCurrentTime(float CurrentTime){
        this.currentTime=currentTime;
        if(this.currentTime==this.feedingTime)
            System.out.println("The fish needs foos!");
            feeder.feed();
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
                '}';
    }
}
