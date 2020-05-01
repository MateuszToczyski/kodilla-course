package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        TaskList taskList = new TaskList("My task list", "This is my first task list");
        taskListDao.save(taskList);
        String name = taskList.getName();
        TaskList taskListResult = taskListDao.findByName(name);

        Assert.assertEquals(name, taskListResult.getName());
        taskListDao.deleteById(taskListResult.getId());
    }
}