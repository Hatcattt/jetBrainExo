package dev.hatcattt.jtbrn.exos;

import java.io.IOException;
import java.util.logging.*;

public class LoggerExample {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(LoggerExample.class.getName());
        logger.log(Level.WARNING, "Log depuis le main " + logger.getName());

        // Log Level:
        // SEVERE(1000)
        // WARNING(900)
        // INFO(800)
        // CONFIG(700)
        // FINE(500)
        // FINER(400)
        // FINEST(300)

        logger.severe("Severe Log");
        logger.warning("Warning Log");
        logger.info("Info Log");

        System.out.println("---------------");

        Handler fileHandler = new FileHandler("default.log");
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new XMLFormatter());
        logger.info("Info log message");

        Filter filter = new InfoLogger();
        logger.setFilter(filter);
        logger.severe("Severe Lodddg"); // not display
        logger.info("Info Loddg");      // display

    }
}

// restreinte les logs seulement pour une gravité spéciale
class InfoLogger implements Filter {
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.INFO;
    }
}