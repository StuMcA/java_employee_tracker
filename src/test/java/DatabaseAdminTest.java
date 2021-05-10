import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Andrew", "AD34567890", 20000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(3000);
        assertEquals(23000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }
}
