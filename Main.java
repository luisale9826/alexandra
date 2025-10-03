public class Main {
    public static void main(String[] args) {
      Train train = new Train(FuelType.ELECTRIC, 100, 100, 3, 2);
        Passenger passenger1 = new Passenger("Alice");
        Passenger passenger2 = new Passenger("Bob");
        Passenger passenger3 = new Passenger("Charlie");
        Passenger passenger4 = new Passenger("Diana");
        Passenger passenger5 = new Passenger("Eve");
        train.getCar(0).addPassenger(passenger1);
        train.getCar(0).addPassenger(passenger2);
        train.getCar(1).addPassenger(passenger3);
        train.getCar(1).addPassenger(passenger4);
        train.getCar(2).addPassenger(passenger5);
        train.printManifest();
        System.out.println("Seats remaining: " + train.seatsRemaining());
        train.getCar(0).removePassenger(passenger5);
    }
}

