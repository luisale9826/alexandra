public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double maxFuel;
    private double currentLevelFuel;

    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentLevelFuel = currentFuelLevel;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }
    @Override
    public double getMaxFuel() {
        return maxFuel;
    }
    @Override
    public double getCurrentFuel() {
        return currentLevelFuel;
    }
    @Override
    public void refuel() {
        currentLevelFuel = maxFuel;
    }
    @Override
    public Boolean go() {
        if (currentLevelFuel > 0) {
            currentLevelFuel -= 1;
            System.out.println("The remaining level of fuel is " + currentLevelFuel);
            return true;
        } else {
            return false;
        }
    }
}