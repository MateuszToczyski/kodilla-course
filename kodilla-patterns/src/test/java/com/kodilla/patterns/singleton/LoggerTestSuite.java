package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        Logger logger = Logger.getInstance();
        logger.log("foo");
        Assert.assertEquals("foo", logger.getLastLog());
    }
}
