package Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("Resume.docx");
        File file2 = new File("Photo.jpg");
        File file3 = new File("Budget.xlsx");

        Folder folder1 = new Folder("Personal");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Work");
        folder2.addComponent(file3);
        folder2.addComponent(folder1);  // Nesting folders

        folder2.showDetails();
    }
}
