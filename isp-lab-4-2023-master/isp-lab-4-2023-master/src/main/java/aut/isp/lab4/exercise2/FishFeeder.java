/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aut.isp.lab4.exercise2;

/**
 *
 * @author User
 */
public class FishFeeder {

    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model, int meals){
        this.manufacturer=manufacturer;
        this.model=model;
        this.meals=meals;
    }
    public int getMeals(){
        return meals;
    }

    @Override
    public String toString() {
        return "FishFeeder{" + "manufacturer=" + manufacturer + ", model=" + model + ", meals=" + meals + '}';
    }
    
    public void feed(){
    }
}
