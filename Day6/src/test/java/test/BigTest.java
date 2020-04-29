package test;


import entity.AutomatedTest;
import entity.ManualTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import worker.AutomationEngineer;
import worker.Engineer;
import worker.TestEngineer;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BigTest {

    private Engineer en;
    private entity.Test test;
    private int skill;
    private Result expected;

    public BigTest(Engineer en, int skill, entity.Test test, Result expected) {
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