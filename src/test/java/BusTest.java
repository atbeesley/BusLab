import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Person passenger;
    private Bus bus;

    @Before
    public void before(){
        passenger = new Person();
        bus = new Bus("Ocean Terminal");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void addPassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(3, bus.passengerCount());
    }
    @Test
    public void canRemovePassenger() {
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }
}
