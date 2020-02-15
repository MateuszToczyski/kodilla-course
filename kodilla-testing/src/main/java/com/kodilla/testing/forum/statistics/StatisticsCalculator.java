package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        double usersCount = statistics.userNames().size();
        double postsCount = statistics.postsCount();
        double commentsCount = statistics.commentsCount();

        if(usersCount <= 0) {
            throw new IllegalArgumentException("userNames size has to be greater than 0");
        } else if(postsCount <= 0) {
            throw new IllegalArgumentException("postsCount has to be greater than 0");
        } else if(commentsCount < 0) {
            throw new IllegalArgumentException("commentsCount has to be equal to or greater than 0");
        }

        avgPostsPerUser = postsCount / usersCount;
        avgCommentsPerUser = commentsCount / usersCount;
        avgCommentsPerPost = commentsCount / postsCount;
    }
}
