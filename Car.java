import java.util.ArrayList;

public class Car implements CarRequirements {
    private ArrayList<Passenger> passengers = null;
    private int maxCapacity;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>(maxCapacity);
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }

    public Boolean removePassenger(Passenger p) {
        Boolean isPassengerInCar = false;
        int searchedPassenger = -1;
        searchedPassenger = passengers.indexOf(p);
        if (searchedPassenger == -1) {
            System.out.println("Passenger not in the car");
            return isPassengerInCar;
        }

        passengers.remove(searchedPassenger);
        isPassengerInCar = true;
        return isPassengerInCar;
    }

    public void printManifest() {
        if (passengers.size() == 0) {
        System.out.println("THIS CAR IS EMPTY");
            return;
        }

        System.out.println("Current Passengers in the car:");
        for (Passenger p : passengers) {
            System.out.println(p.getName());
        }

        /*
         * for (int i = 0; i < passengers.size(); i++) {
         * System.out.println(passengers.get(i).getName());
         * }
         */
    }
    
}