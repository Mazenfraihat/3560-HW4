public class Q5Driver {
    public static void main(String[] args) {

        // ----- Build the structure -----
        Folder phpDemo1 = new Folder("php_demo1");

        Folder sourceFiles = phpDemo1.addSubFolder("Source Files");
        phpDemo1.addSubFolder("Include Path");
        phpDemo1.addSubFolder("Remote Files");

        sourceFiles.addSubFolder(".phalcon");

        Folder app = sourceFiles.addSubFolder("app");
        app.addSubFolder("config");
        app.addSubFolder("controllers");
        app.addSubFolder("library");
        app.addSubFolder("migrations");
        app.addSubFolder("models");
        app.addSubFolder("views");

        sourceFiles.addSubFolder("cache");

        Folder publicFolder = sourceFiles.addSubFolder("public");
        publicFolder.addFile(".htaccess");
        publicFolder.addFile(".htrouter.php");
        publicFolder.addFile("index.html");

        // ----- 1. Print the full structure -----
        System.out.println("=== FULL STRUCTURE ===");
        phpDemo1.print("");

        // ----- 2. Delete the app folder, print again -----
        System.out.println();
        System.out.println("=== AFTER DELETING 'app' ===");
        phpDemo1.deleteSubFolder("app");
        phpDemo1.print("");

        // ----- 3. Delete the public folder, print again -----
        System.out.println();
        System.out.println("=== AFTER DELETING 'public' ===");
        phpDemo1.deleteSubFolder("public");
        phpDemo1.print("");
    }
}