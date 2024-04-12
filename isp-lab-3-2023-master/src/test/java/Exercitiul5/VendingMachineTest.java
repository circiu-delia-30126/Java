package Exercitiul5;


import isp.lab3.exercise5.Product;
import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void testDisplayProducts(){
        Product p1=new Product(4,"Banane",10,5);
        Product p2=new Product(6,"Mere",1,18);
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p2);
        assertEquals(p1.getId()+"." +p1.getName()+"\n" + p2.getId()+"." +p2.getName()+"\n",
                vendingMachine.displayProducts());


    }

    @Test
    public void testSelectProduct(){
        Product p1=new Product(4,"Banane",10,5);
        Product p2=new Product(6,"Mere",1,18);
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p2);
        assertEquals(p1.getName() ,
                vendingMachine.selectProduct(4));


    }


}

