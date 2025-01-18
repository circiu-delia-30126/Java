
public class Main {
    public static void main(String[] args) {
        //printf() = an optional method to control, format, and display text to the console window
        //          two arguments = format string + (object/variable/value
        //          %[flags] [precision] [width] [conversion-character]

    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Delia";
    int myInt = 50;
    double myDouble = 1000;

        //System.out.printf("%b%n ",myBoolean);
        //System.out.printf("%c%n ",myChar);
        //System.out.printf("%s%n ",myString);
        //System.out.printf("%d%n ",myInt);
        //System.out.printf("%f%n ",myDouble);

    //[width]
        //System.out.printf("Hello %20s", myString);
    //[precision]
        System.out.printf("You have this much money %.1f",myDouble);

    }
}