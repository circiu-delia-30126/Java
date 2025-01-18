
public class Main {
    public static void main(String[] args) {
        //wrapper class = provides a way to use primitive data types as reference data types
        // autoboxing= the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper
        //unboxing= the reverse of autoboxing; Automatic conversion of wrapper class to primitive.

//autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c  = 123;
        Double d = 3.14;
        String e = "Delia";

//unboxing
        if(a==true){ //a se comporta ca primitive data types
            System.out.println("This is  true");
        }

    }
}