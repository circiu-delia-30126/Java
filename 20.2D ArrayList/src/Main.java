import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> bakeryList= new ArrayList();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList= new ArrayList();

        produceList.add("tomatoes");
        produceList.add("cucumbers");
        produceList.add("potatoes");

       ArrayList<String> drinksList = new ArrayList();

       drinksList.add("soda");
       drinksList.add("wine");

       ArrayList<ArrayList<String>> groceryList = new ArrayList();
       groceryList.add(bakeryList);
       groceryList.add(produceList);
       groceryList.add(drinksList);

        System.out.println(groceryList.get(1).get(0));
    }
}