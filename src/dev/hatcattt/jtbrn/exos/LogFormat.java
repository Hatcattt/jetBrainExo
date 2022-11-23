package dev.hatcattt.jtbrn.exos;

// all log level possible
enum LogLevel {
    // DIWEF
    DEBUG,  // output of some function
    INFO,   // important information : how much register on your site
    WARN,   // 1er level of application failure : not affect the user at this point
    ERROR,  // 2eme level of application : critical problem : error, not log cause db problem
    FATAL,   // 3eme level of failure : causes the termination of the program
}

public class LogFormat {
    // usual log format
    // [date time][log level][message]

    // example : demo registers in your site
    // [2021-02-02 01:00:10] [INFO] User 'demo' has registered

    // use 'bad' cannot log cause technical issue
    // [2021-02-02 01:00:10] [ERROR] User 'bad' cannot log in because the database is temporarily unavailable



}
