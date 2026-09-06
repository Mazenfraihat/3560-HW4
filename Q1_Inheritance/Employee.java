//Declaring a class
public class Employee {
    private String f_name; //Fields
    private String l_name;
    private String ssn;

    public Employee (String f_name, String l_name, String ssn) { //Constructors

        this.f_name = f_name; //parameters being saved
        this.l_name = l_name;
        this.ssn = ssn;
    }

    public void setF_name(String f_name) { //Setters (mutators)
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


//Getters (accessors)
    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getSsn() {
        return ssn;
    }

        public void print() {
        System.out.println("Name: " + f_name + " " + l_name + "  |  SSN: " + ssn);
    }

}


