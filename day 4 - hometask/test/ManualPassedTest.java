package com.DAY_4.test;

import com.DAY_4.entity.ManualTest;
import com.DAY_4.entity.Result;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualPassedTest {
    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 4);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals(Result.PASSED, manualTest.apply(testEngineer));
    }
}
