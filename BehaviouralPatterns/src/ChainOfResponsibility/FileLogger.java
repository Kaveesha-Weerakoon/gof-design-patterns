package ChainOfResponsibility;

class FileLogger extends Logger {
    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("File: " + message);
    }
}