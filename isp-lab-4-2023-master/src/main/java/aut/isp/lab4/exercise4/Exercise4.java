package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
AquariumController controller1=new AquariumController("Samsung","456A");
controller1.setFeedingTime(12.30F);
controller1.setLightsTime(12.30F);
        int i;
        for(i=1; i<10; i++)
controller1.setCurrentTime(7+(float)i);
        System.out.println("The current time is "+controller1.getCurrentTime());
        System.out.println("The light in the aquarium is "+controller1.getStatus()+"\n");

    }
}
