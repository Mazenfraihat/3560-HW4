public class Q1Driver {
    public static void main(String[] args) {

        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        joe.print();
        System.out.println();

        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        stephanie.print();
        System.out.println();

        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        mary.print();
        System.out.println();

        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        nicole.print();
        System.out.println();

        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        renwa.print();
        System.out.println();

        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        mike.print();
        System.out.println();

        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);
        mahnaz.print();
        System.out.println();
    }
}