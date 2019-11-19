import java.util.ArrayList;

public class Bus {

    private String destination;
    private ArrayList<Person> passengerList;

    public Bus(String destination){
        this.passengerList = new ArrayList<Person>();
        this.destination = destination;
    }

    public int passengerCount() {
        return this.passengerList.size();
    }

    public void addPassenger(Person person) {
        if (passengerCount() < 3) {
            this.passengerList.add(person);
        }
    }

    public void removePassenger() {
        passengerList.remove(0);
    }
}
