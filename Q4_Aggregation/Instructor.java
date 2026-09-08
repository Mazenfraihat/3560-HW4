public class Instructor {

    private String f_name;
    private String l_name;
    private String officeNumber;

    public Instructor(String f_name, String l_name, String officeNumber) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.officeNumber = officeNumber;
    }

    // Setters (mutators)
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    // Getters (accessors)
    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}