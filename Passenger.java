public class Passenger implements PassengerRequirements {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void boardCar(Car c) {
       if (c.addPassenger(this)) {
        System.out.println(this.name + " has boarded the car.");
       } else {
        System.out.println("The car is full. " + this.name + " cannot board the car.");
       }
    }

    @Override
    public void getOffCar(Car c) {
       if (c.removePassenger(this)) {
        System.out.println(this.name + " has gotten off the car.");
       } else {
        System.out.println(this.name + " is not in the car.");
       }
    }
}
