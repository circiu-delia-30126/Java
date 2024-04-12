package isp.lab3.exercise5;

import java.util.ArrayList;


public class VendingMachine {
    private ArrayList<Product> products;
    private int credit;

    public VendingMachine(ArrayList<Product> products, int credit) {
        this.products = products;
        this.credit = credit;
    }
//constructor implicit
    public VendingMachine() {
        this.products=new ArrayList<Product>();
        this.credit=0;
    }
//getter si setter
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
public String displayProducts()
{String s="";
    for(Product p : products) {
        if (p.getQuantity() > 0)
            System.out.println(p.getId() + '.' + p.getName());
        s = s + p.getId() + '.' + p.getName() + "\n";
    }
    return s;
    }
public void insertCoin(int value){
this.credit+=value;
}

public String selectProduct(int id) {
for(Product p:products){
    if(p.getId()==id)
return p.getName();
}
return "error";
}

public void displayCredit() {
    System.out.println(credit);
}

public void userMenu() {
    System.out.println("Pasi de urmat pentru utilizarea tonomatului:\n"+
            "1.Alegeti un produs din lista de mai jos:\n\n ");
    displayProducts();
    System.out.println("\n\n"+
            "2.Introduceti creditul necesar in functie de produsul ales\n"+
  "3.Introduceti id-ul produsului, apoi apasati tasta enter");         ;
}
public void addProduct(Product p) {
    products.add(p);
}
}
