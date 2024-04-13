package aut.isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        AquariumController controller2=new AquariumController("Ailed","12");
controller2.setFeedingTime(12.21f);
for(int i=1;i<10;i++){
controller2.setCurrentTime(3.21f+(float)i);
    System.out.println("Current time is "+controller2.getCurrentTime());
}
controller2.setPresetTemperature(1000);
controller2.setPresetTemperature(35);
controller2.ChangeWaterpH();
        System.out.println(controller2.checkTemperature());
        System.out.println(controller2.checkWaterLevel());

    }
}
