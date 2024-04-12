package Exercitiul4;

import isp.lab3.exercise4.MyPoint;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void testDistance()
    { MyPoint point1=new MyPoint(3,0,0);
        MyPoint point2=new MyPoint(0,4,0);
        assertEquals(5, point1.distance(point2),0.01);
    }
}
