package aut.isp.lab4.exercise6;

public class LevelSensor extends Sensor{
    private float value;

    public LevelSensor(String manufacturer, String model, String unitOfMeasurement) {
        super(manufacturer, model, unitOfMeasurement);
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LevelSensor{" +
                "value=" + value +
                '}';
    }
}
