public class CargoShip extends Ship {

    private int cargoCapacityTn;

    public CargoShip(String shipName, String yearBuilt, int cargoCapacityTn) {
        super(shipName, yearBuilt);
        this.cargoCapacityTn = cargoCapacityTn;
    }

    // Setters (mutators)
    public void setCargoCapacityTn(int cargoCapacityTn) {
        this.cargoCapacityTn = cargoCapacityTn;
    }

    // Getters (accessors)
    public int getCargoCapacityTn() {
        return cargoCapacityTn;
    }

    public void print() {
        System.out.println("Ship: " + getShipName() + ", Cargo Capacity in Tons: " + cargoCapacityTn);
    }
}