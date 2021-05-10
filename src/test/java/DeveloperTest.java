import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Dave", "AC23456789", 25000.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(3000);
        assertEquals(28000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, developer.payBonus(), 0.01);
    }

    @Test
    public void payRiseNeedsPositiveValue() {
        developer.raiseSalary(-1000.00);
        assertEquals(25000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canUpdateName() {
        developer.updateName("Tom");
        assertEquals("Tom", developer.getName());
    }

    @Test
    public void nameChangeWontAcceptNull() {
        developer.updateName("");
        assertEquals("Dave", developer.getName());
    }
}
