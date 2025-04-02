package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testRejectGreaterValue() {
        HanoiRhymer rhymer = new HanoiRhymer();

        rhymer.countIn(5);
        rhymer.countIn(10);

        int result = rhymer.countOut();
        Assert.assertEquals(5, result);
        Assert.assertEquals(1, rhymer.reportRejected());
    }

    @Test
    public void testAllowSmallerOrEqualValue() {
        HanoiRhymer rhymer = new HanoiRhymer();

        rhymer.countIn(10);
        rhymer.countIn(10);
        rhymer.countIn(5);

        Assert.assertEquals(0, rhymer.reportRejected());

        Assert.assertEquals(5, rhymer.countOut());
        Assert.assertEquals(10, rhymer.countOut());
        Assert.assertEquals(10, rhymer.countOut());
    }

    @Test
    public void testEmptyStackAcceptance() {
        HanoiRhymer rhymer = new HanoiRhymer();

        rhymer.countIn(42);

        Assert.assertEquals(0, rhymer.reportRejected());
        Assert.assertEquals(42, rhymer.countOut());
    }
}
