package aut.isp.lab4.exercise6;

public class Sensor {
    private String manufacturer;
    private String model;
    private String unitOfMeasurement;

    public Sensor(String manufacturer, String model, String unitOfMeasurement) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                '}';
    }
}
