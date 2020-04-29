package com.DAY_4.test;

import com.DAY_4.entity.AutomatedTest;
import com.DAY_4.entity.ManualTest;
import com.DAY_4.entity.Result;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.AutomationEngineer;
import com.DAY_4.worker.Engineer;
import com.DAY_4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BigTest {

    private Engineer en;
    private com.DAY_4.entity.Test test;
    private int skill;
    private Result expected;

    public BigTest(Engineer en, int skill, com.DAY_4.entity.Test test, Result expected) {
        this.en = en;
        this.skill = skill;
        this.test = test;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer(), 1, new ManualTest(TestLevel.UNIT, 10), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(TestLevel.GUI, 11), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(TestLevel.API, 1), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(TestLevel.UNIT, 0), Result.PASSED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.GUI, 0), Result.PASSED},
                {new TestEngineer(), 10, new AutomatedTest(TestLevel.API, 10), Result.PASSED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.UNIT, 1), Result.PASSED},
                {new TestEngineer(), 10, new AutomatedTest(TestLevel.GUI, 11), Result.PASSED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.API, 10), Result.PASSED},
                {new AutomationEngineer(), 1, new ManualTest(TestLevel.UNIT, 11), Result.PASSED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.GUI, 1), Result.PASSED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.API, 0), Result.PASSED},
                {new AutomationEngineer(), 1, new AutomatedTest(TestLevel.UNIT, 1), Result.PASSED},
                {new AutomationEngineer(), 10, new AutomatedTest(TestLevel.GUI, 0), Result.PASSED},
                {new AutomationEngineer(), 1, new AutomatedTest(TestLevel.API, 10), Result.PASSED},
                {new AutomationEngineer(), 1, new AutomatedTest(TestLevel.UNIT, 11), Result.PASSED}
        });
    }

    @Test
    public void verifyTest() {
        en.setSkill(skill);
        Assert.assertEquals("Engineer Anxiety is not correct!", expected, en.executeTest(test));
    }
}