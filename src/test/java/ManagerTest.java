import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Steve", "AB12345678", 30000.00, "Operations");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
}
