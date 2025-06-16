package Builder;

public class Computer {
    private String CPU;
    private String RAM;
    private boolean hasSSD;
    private boolean hasGraphicsCard;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.hasSSD = builder.hasSSD;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private boolean hasSSD;
        private boolean hasGraphicsCard;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void displaySpecs() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM +
                ", SSD: " + hasSSD + ", Graphics Card: " + hasGraphicsCard);
    }
}
