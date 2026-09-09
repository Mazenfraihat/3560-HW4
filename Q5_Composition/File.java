public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    // Setter (mutator)
    public void setName(String name) {
        this.name = name;
    }

    // Getter (accessor)
    public String getName() {
        return name;
    }

    public void print(String indent) {
        System.out.println(indent + name);
    }
}