public class Main {
    public static void main(String[] args) {
        Car car = new Car(2);
        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");
        Passenger p3 = new Passenger("Charlie");

        System.out.println("Car capacity: " + car.getCapacity());
        System.out.println("Seats remaining: " + car.seatsRemaining());

        p1.boardCar(car);
        p2.boardCar(car);
        p3.boardCar(car); // This should indicate the car is full

        car.printManifest();

        p1.getOffCar(car);
        car.printManifest();
    }
}