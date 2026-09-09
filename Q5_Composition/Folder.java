import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    // Setters (mutators)
    public void setName(String name) {
        this.name = name;
    }

    // Getters (accessors)
    public String getName() {
        return name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    // Add contents - the folder OWNS them
    public void addFile(String fileName) {
        files.add(new File(fileName));
    }

    public Folder addSubFolder(String folderName) {
        Folder sub = new Folder(folderName);
        subFolders.add(sub);
        return sub;
    }

    // Delete a sub-folder by name. Everything inside it goes too.
    public boolean deleteSubFolder(String folderName) {
        for (int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).getName().equals(folderName)) {
                subFolders.remove(i);
                return true;
            }
        }
        for (Folder sub : subFolders) {
            if (sub.deleteSubFolder(folderName)) {
                return true;
            }
        }
        return false;
    }

    // Recursive print - prints this folder, then everything inside it
    public void print(String indent) {
        System.out.println(indent + name);

        for (Folder sub : subFolders) {
            sub.print(indent + "    ");
        }

        for (File f : files) {
            f.print(indent + "    ");
        }
    }
}