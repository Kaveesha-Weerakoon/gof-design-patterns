package ChainOfResponsibility;

public class ChainPatternDemo {

    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an INFO.");
        loggerChain.logMessage(Logger.DEBUG, "This is a DEBUG.");
        loggerChain.logMessage(Logger.ERROR, "This is an ERROR.");
    }
}

