public class LoggerDoubleCheck {
    //1. Creating a private static variable of the same class that is the only instance of the class.
    private static volatile LoggerDoubleCheck logger; 

    //2. Making the constructor private so that this class cannot be instantiated.
    private LoggerDoubleCheck() {}

    //3. Providing a public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
    public static LoggerDoubleCheck getLogger() {
        if (logger == null) {
            synchronized (LoggerDoubleCheck.class) {
                if(logger == null) {
                    logger = new LoggerDoubleCheck();
                }
            }
        }

        return logger;
    }

    // Example method to demonstrate functionality
    public void log(String message) {
        System.out.println("Log -> " + message);
    }
}
