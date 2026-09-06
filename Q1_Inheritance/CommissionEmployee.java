//Declaring a class
public class CommissionEmployee extends Employee {
    private double commissionRate; //Fields
    private double grossSale;

    public CommissionEmployee(String f_name, String l_name, String ssn, double commissionRate, double grossSale) {
        super(f_name, l_name, ssn);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }


    public void print() {
        super.print();
        System.out.println("Comission Rate: " + commissionRate + ", Gross Sale:" + grossSale);
    }
}