package com.kodilla.patterns2.observer.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mentor implements Observer {

    private int updateCount;
    private final static Logger LOGGER = LoggerFactory.getLogger(Mentor.class);

    @Override
    public void update(Student student) {
        LOGGER.info("New task has been submitted by " + student.getName());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void markTaskAsSolved(Task task) {
        task.markAsSolved();
    }
}
