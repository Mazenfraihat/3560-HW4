import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Instructor> instructors;
    private ArrayList<Textbook> textbooks;

    public Course(String courseName, ArrayList<Instructor> instructors, ArrayList<Textbook> textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    // Setters (mutators)
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    // Getters (accessors)
    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void print() {
        System.out.println("Course: " + courseName);

        for (Instructor i : instructors) {
            System.out.println("Instructor: " + i.getF_name() + " " + i.getL_name());
        }

        for (Textbook t : textbooks) {
            System.out.println("Textbook: " + t.getTitle() + " by " + t.getAuthor());
        }
    }
}