package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder feeder1=new FishFeeder("Lenovo","X15",5);
        AquariumController controller1=new AquariumController(feeder1,"Axis","AB");
        controller1.setFeedingTime(14.50f);
        for(int i=0;i<10;i++) {
            controller1.setCurrentTime(12.25f+(float)i);
            System.out.println("Current time is"+controller1.getCurrentTime());

        }
        }



    }

