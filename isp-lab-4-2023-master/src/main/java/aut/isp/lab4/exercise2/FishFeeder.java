package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }

    public int getMeals() {
        return meals;
    }

    public void fillUp() {
        this.meals = 14;
        System.out.println("The fish feeder is filled");
    }

    public void feed() {
        if (meals > 0) {
            this.meals -= 1;
            System.out.println("The fish had been fed.");
            System.out.println("The feeder still has " + this.meals + " meals left");
        } else
            System.out.println("The fish feeder is empty");
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}

