package Exercitiul2;

import aut.isp.lab4.exercise2.FishFeeder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishFeederTest {
    @Test
    public void testFeed(){
        FishFeeder feeder2=new FishFeeder("Boob","X2",4);
        feeder2.fillUp();
        assertEquals(14,feeder2.getMeals());
        feeder2.feed();
    assertEquals(13,feeder2.getMeals());
    }
}
