public class Main {
    public static void main(String[] args) {
        //array= used to store multiple values in a single variable

        String[] cars=new String[3];

        cars[0]="Mustang";
        cars[1]="Mercedes";
        cars[2]="BMW";

        for(int i=0;i<=cars.length-1;i++){
            System.out.println(cars[i]);
        }
    }
}