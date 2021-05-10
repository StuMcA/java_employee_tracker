import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("James","ABZ12345", 50000.00,"CEO",1000000.00);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, director.payBonus(), 0.01);
    }
}
