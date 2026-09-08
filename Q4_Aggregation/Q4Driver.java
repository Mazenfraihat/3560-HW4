import java.util.ArrayList;

public class Q4Driver {
    public static void main(String[] args) {

        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Nima", "Davarpanah", "3-2636"));
        instructors.add(new Instructor("Sarah", "Chen", "8-1420"));

        ArrayList<Textbook> textbooks = new ArrayList<>();
        textbooks.add(new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"));
        textbooks.add(new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley"));

        Course cs3560 = new Course("CS 3560", instructors, textbooks);
        cs3560.print();
    }
}