package Exercitiul2;

import isp.lab3.exercise2.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testGetPerimeter()
    {
        Rectangle obj=new Rectangle(1,5,"blue");
        assertEquals(12,obj.getPerimeter());

    }
}
