
public class Main {
    public static void main(String[] args) {
String[][] cars={
                    {"bmw","mercedes","audi"},
                    {"corvette","lambo","camaro"},
                 };

for(int i=0;i<cars.length;i++){
    System.out.println();
    for(int j=0;j<cars[i].length;j++){//cars[i].length-returneaza lungimea randului specificat(nr de coloane din randul i)
        System.out.print(cars[i][j]+" ");
    }
}

    }
}