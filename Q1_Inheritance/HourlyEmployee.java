//Declaring a class
public class HourlyEmployee extends Employee {
    private double wage; //Fields
    private double hoursWorked;

    public HourlyEmployee(String f_name, String l_name, String ssn, double wage, double hoursWorked) {
        super(f_name, l_name, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getWage() {
        return wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }


    public void print() {
        super.print();
        System.out.println("wage: " + wage + ", hours worked:" + hoursWorked);
    }
}