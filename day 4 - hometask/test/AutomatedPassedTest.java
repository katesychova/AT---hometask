package com.DAY_4.test;

import com.DAY_4.entity.AutomatedTest;
import com.DAY_4.entity.Result;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedPassedTest {
    @Test
    public void automatedPassedTest() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 3);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals(Result.PASSED, automatedTest.apply(testEngineer));
    }
}
