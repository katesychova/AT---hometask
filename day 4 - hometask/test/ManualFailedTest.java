package com.DAY_4.test;

import com.DAY_4.entity.ManualTest;
import com.DAY_4.entity.Result;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualFailedTest {

    @Test
    public void manualFailedTest() {
        ManualTest manualTest = new ManualTest(TestLevel.GUI, 15);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals(Result.FAILED, manualTest.apply(automationEngineer));
    }
}
