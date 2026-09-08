public class Q3Driver {
    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Old Explorer", "1985");
        ships[1] = new CruiseShip("Ocean Queen", "2010", 3000);
        ships[2] = new CargoShip("Sea Hauler", "1998", 75000);

        for (int i = 0; i < ships.length; i++) {
            ships[i].print();
        }
    }
}