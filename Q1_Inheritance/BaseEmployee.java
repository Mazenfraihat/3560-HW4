//Declaring a class
public class BaseEmployee extends Employee {
    private double baseSalary; //Fields

    public BaseEmployee(String f_name, String l_name, String ssn, double baseSalary) {
        super(f_name, l_name, ssn);
        this.baseSalary = baseSalary;

    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    public double getBaseSalary() {
        return baseSalary;
    }



    public void print() {
        super.print();
        System.out.println("Base Salary: " + baseSalary);
    }
}