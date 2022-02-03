package singleton;

/**
 * Singleton Pattern
 * Used for logging, thread pool, driver objects, and caching.
 */
public class Logger {

    // Create a private logger instance within the Logger class
    private static Logger logger;

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

}
