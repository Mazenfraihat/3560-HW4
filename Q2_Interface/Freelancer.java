public class Freelancer implements Payable {

    private String f_name;
    private String l_name;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String f_name, String l_name, double hourlyRate, double hoursWorked) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Setters (mutators)
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    // Getters (accessors)
    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }


    public String getPayeeName() {
        return f_name + " " + l_name;
    }

    public double calculatePayment() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            return (40 * hourlyRate) + (((hoursWorked - 40) * 1.5) * hourlyRate);
        }
    }

    public void print() {
        System.out.println("name: " +  f_name + " " + l_name + ", calculated payment: " + calculatePayment());
    }

}