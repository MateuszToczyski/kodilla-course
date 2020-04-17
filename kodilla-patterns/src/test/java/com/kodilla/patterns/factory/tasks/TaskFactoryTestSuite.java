package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateTask() {

        TaskFactory factory = new TaskFactory();

        Task shoppingTask = factory.createTask(TaskFactory.Type.SHOPPING, "Shopping task");
        Task paintingTask = factory.createTask(TaskFactory.Type.PAINTING, "Painting task");
        Task drivingTask = factory.createTask(TaskFactory.Type.DRIVING, "Driving task");

        Assert.assertEquals("Shopping task", shoppingTask.getName());
        Assert.assertEquals("Painting task", paintingTask.getName());
        Assert.assertEquals("Driving task", drivingTask.getName());
    }

    @Test
    public void testExecuteTask() {

        TaskFactory factory = new TaskFactory();

        Task shoppingTask = factory.createTask(TaskFactory.Type.SHOPPING, "Shopping task");
        Task paintingTask = factory.createTask(TaskFactory.Type.PAINTING, "Painting task");
        Task drivingTask = factory.createTask(TaskFactory.Type.DRIVING, "Driving task");

        shoppingTask.execute();
        paintingTask.execute();
        drivingTask.execute();

        Assert.assertTrue(shoppingTask.isExecuted());
        Assert.assertTrue(paintingTask.isExecuted());
        Assert.assertTrue(drivingTask.isExecuted());
    }
}
