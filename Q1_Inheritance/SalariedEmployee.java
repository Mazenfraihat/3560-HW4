//Declaring a class
public class SalariedEmployee extends Employee {
    private double Salary; //Fields

    public SalariedEmployee(String f_name, String l_name, String ssn, double Salary) {
        super(f_name, l_name, ssn);
        this.Salary = Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void print() {
        super.print();
        System.out.println("Weekly Salary: " + Salary);
    }
}