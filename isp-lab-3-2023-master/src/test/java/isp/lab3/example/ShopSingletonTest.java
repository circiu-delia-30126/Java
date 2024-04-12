package isp.lab3.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Radu Miron
 * @version 1
 */
public class ShopSingletonTest {
    @Test
    public void testGetInstance() {
        ShopSingleton[] shops = new ShopSingleton[100];
        for (int i = 0; i < 100; i++) {
            shops[i] = ShopSingleton.getInstance(); // call get instance 100 times
        }

        ShopSingleton firstShop = shops[0];
        int distinctInstancesCounter = 1;

        // count how many shop instances in 'shops' are not equal to the first shop
        for (ShopSingleton shop : shops) {
            if (firstShop != shop){
                distinctInstancesCounter++;
            }
        }

        Assert.assertTrue(distinctInstancesCounter == 1);
    }
}
