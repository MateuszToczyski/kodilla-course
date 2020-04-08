package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("board");

        board.getToDoList().getTasks().add("Task in backlog");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Completed task");

        Assert.assertEquals("Task in backlog", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Completed task", board.getDoneList().getTasks().get(0));
    }
}
