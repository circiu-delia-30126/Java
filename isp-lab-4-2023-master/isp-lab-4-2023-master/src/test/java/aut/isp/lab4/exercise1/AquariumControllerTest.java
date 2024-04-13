package aut.isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AquariumControllerTest {

   @Test
    public void AquariumControllerTest() {

        AquariumController obiect =
                new AquariumController("ABC01", "Model A", 10.30f);

        obiect.setCurrentTime(200f);
        assertEquals(200, obiect.getCurrentTime(), 0.001);
    }
}