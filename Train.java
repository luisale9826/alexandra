import java.util.ArrayList;

public class Train implements TrainRequirements {
    
    private Engine engine;
    private ArrayList<Car> cars = null;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<>(nCars);
        this.cars = new ArrayList<Car>(nCars);
        this.setCarsCapacity(nCars, passengerCapacity);
    }

    @Override
    public Engine getEngine() {
        return engine;
    }


    public void setCarsCapacity(int nCars, int capacity) {
        for (int i = 0; i < nCars; i++) {
            Car car = new Car(capacity);
            cars.add(car);
        }
    }

    @Override
    public Car getCar(int i) {
        return this.cars.get(i);
    }

    @Override
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (int i = 0; i < cars.size(); i++) {
            totalCapacity += cars.get(i).getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int seatsRemaining() {
        int totalSeatsRemaining = 0;
        for (int i = 0; i < cars.size(); i++) {
            totalSeatsRemaining += cars.get(i).seatsRemaining();
        }
        return totalSeatsRemaining;
    }

    @Override
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }

}
