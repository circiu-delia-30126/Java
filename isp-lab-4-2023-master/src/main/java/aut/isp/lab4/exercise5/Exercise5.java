package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        AquariumController controller1=new AquariumController("Sung","a12");
        controller1.setFeedingTime(12.32F);
        for (int i = 0; i <10 ; i++) {
            controller1.setCurrentTime(10.32F+(float)i);
            System.out.println("Current time is "+controller1.getCurrentTime());
        }
        controller1.setPresetLevel(15);
        controller1.setPresetTemperature(26);
        System.out.println(controller1.checkTemperature());
        System.out.println(controller1.checkWaterLevel());
    }
}