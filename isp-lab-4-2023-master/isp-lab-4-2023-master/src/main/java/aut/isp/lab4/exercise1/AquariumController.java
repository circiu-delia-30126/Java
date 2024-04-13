package aut.isp.lab4.exercise1;

public class AquariumController {

    private final String manufacturer;
    private final String model;
    private float currentTime;

    
   public AquariumController( String manufacturer, String model ,float currentTime)
   {
       this.manufacturer=manufacturer;
       this.model=model;
       this.currentTime=currentTime;
       
   }
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public String manufacturer() {
        return manufacturer;
    }

    public String model() {
        return model;
    }

    @Override   //alt+insert
    public String toString() {
        return "AquariumController{" + "manufacturer=" + manufacturer + ", model=" + model + ", currentTime=" + currentTime + '}';
    }
    
    public static void main(String[]args)
    {AquariumController obj = new AquariumController(String manufacturer, String model ,float currentTime);
        System.out.println("");
        
    }
}
