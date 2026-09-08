public class Ship {

    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    // Setters (mutators)
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Getters (accessors)
    public String getShipName() {
        return shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void print() {
        System.out.println("Ship: " + shipName + ", Year built: " + yearBuilt);
    }
}