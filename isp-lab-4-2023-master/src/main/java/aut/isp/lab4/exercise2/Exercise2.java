package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder feeder1 = new FishFeeder("Ailed", "A10", 8);
        for (int i = 1; i <= 15; i++) {
            feeder1.feed();
        }
        feeder1.fillUp();
        feeder1.toString();
    }
}

