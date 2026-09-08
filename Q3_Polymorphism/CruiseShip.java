public class CruiseShip extends Ship {

    private int maxPassengers;

    public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Setters (mutators)
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Getters (accessors)
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void print() {
        System.out.println("Ship: " + getShipName() + ", Max passengers: " + maxPassengers);
    }
}