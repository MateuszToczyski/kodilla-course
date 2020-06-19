package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testTaskNotifications() {
        Student student1 = new Student("John Smith");
        Student student2 = new Student("Mark Peters");
        Student student3 = new Student("Steve Connor");

        Mentor mentor1 = new Mentor();
        Mentor mentor2 = new Mentor();

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);

        student1.addTask(new Task("Task 1"));
        student2.addTask(new Task("Task 2"));
        student3.addTask(new Task("Task 3"));

        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
