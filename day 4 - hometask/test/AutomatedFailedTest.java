package com.DAY_4.test;

import com.DAY_4.entity.AutomatedTest;
import com.DAY_4.entity.Result;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedFailedTest {
    @Test
    public void automatedFailedTest() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI, 4);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals(Result.FAILED, automatedTest.apply(automationEngineer));
    }
}
