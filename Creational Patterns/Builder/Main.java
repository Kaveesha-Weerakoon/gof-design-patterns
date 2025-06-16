package Builder;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder("Intel i7", "16GB")
                .setSSD(true)
                .setGraphicsCard(true)
                .build();

        pc.displaySpecs();
    }
}
