package aut.isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {

    @Test
    public void testToString() {
        // Se creează un obiect AquariumController cu anumite valori pentru producător, model și timp curent
        AquariumController obj2 = new AquariumController("Apple", "Pro", 0.0F);

        // Se verifică dacă rezultatul metodei toString() este egal cu șirul așteptat
        assertEquals("AquariumController{manufacturer='Apple', model='Pro', currentTime=0.0}", obj2.toString());
    }
}
