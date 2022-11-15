package dev.hatcattt.jtbrn.swing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintLog {
    final static SimpleDateFormat DATE = new SimpleDateFormat("[dd-MM-yyyy HH:mm:ss]");
    public static void print(String message) {
        final Date date = new Date();
        String dateFormat = DATE.format(date);
        System.out.format("%s %s\n", dateFormat, message);
    }
}
