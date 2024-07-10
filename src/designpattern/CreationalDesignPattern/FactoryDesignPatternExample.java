package designpattern.CreationalDesignPattern;

//Product interface
interface Logger {
    void log(String msg);
}

//Concert Product Class
class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("Console Logger...");
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("FileLogger...");
    }
}

class DatabaseLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("Database Logger...");
    }
}

//factory class
class LoggerFactory {

    public static Logger getLogger(String type) {
        return switch (type) {
            case "console" -> new ConsoleLogger();
            case "file" -> new FileLogger();
            case "database" -> new DatabaseLogger();
            default -> throw new IllegalArgumentException("Logger Type is not available..");
        };

    }
}


public class FactoryDesignPatternExample {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("console");
        logger.log("This is Console Log...");
        logger=LoggerFactory.getLogger("file");
        logger.log("This is File Log...");
        logger=LoggerFactory.getLogger("database");
        logger.log("This is DB Log...");
    }
}
//Achieved (Factory Design pattern)
//1.Encapsulate Object creation withing single method
//2.Dependency Injection (Loosely Coupled)
//3.open/close principal
