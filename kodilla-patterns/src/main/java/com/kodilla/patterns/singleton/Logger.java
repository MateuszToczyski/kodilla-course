package com.kodilla.patterns.singleton;

public class Logger {

    private String lastLog = "";
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if(instance == null) {
            synchronized(Logger.class) {
                if(instance == null) {
                    instance = new Logger();
                }
            }
        }

        return instance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}