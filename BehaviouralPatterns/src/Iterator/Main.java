package Iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();
        Iterator<String> iter = repo.createIterator();

        while (iter.hasNext()) {
            System.out.println("Name: " + iter.next());
        }
    }
}
