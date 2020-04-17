package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import com.kodilla.patterns.strategy.social.user.Millennial;
import com.kodilla.patterns.strategy.social.user.User;
import com.kodilla.patterns.strategy.social.user.YGeneration;
import com.kodilla.patterns.strategy.social.user.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User millennialUser = new Millennial("steve");
        User yGenUser = new YGeneration("mark");
        User zGenUser = new ZGeneration("greg");

        millennialUser.share();
        yGenUser.share();
        zGenUser.share();

        Assert.assertEquals("Shared on Facebook", millennialUser.getLastPost());
        Assert.assertEquals("Shared on Twitter", yGenUser.getLastPost());
        Assert.assertEquals("Shared on Snapchat", zGenUser.getLastPost());
    }

    @Test
    public void testIndividualSharingStrategy() {

        User millennialUser = new Millennial("steve");
        User yGenUser = new YGeneration("mark");
        User zGenUser = new ZGeneration("greg");

        millennialUser.setPublisher(new SnapchatPublisher());
        yGenUser.setPublisher(new FacebookPublisher());
        zGenUser.setPublisher(new TwitterPublisher());

        millennialUser.share();
        yGenUser.share();
        zGenUser.share();

        Assert.assertEquals("Shared on Snapchat", millennialUser.getLastPost());
        Assert.assertEquals("Shared on Facebook", yGenUser.getLastPost());
        Assert.assertEquals("Shared on Twitter", zGenUser.getLastPost());
    }
}
