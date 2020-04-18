package com.DAY_4.test;

import com.DAY_4.entity.AutomatedTest;
import com.DAY_4.entity.ManualTest;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.AutomationEngineer;
import com.DAY_4.worker.Engineer;
import com.DAY_4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AdditionalUnitTest {

    private Engineer testEngineer = new TestEngineer();
    private Engineer automationEngineer = new AutomationEngineer();

    @Test
    public void verifyDefaultAnxietyByManualTest() {
        Assert.assertEquals("Default Anxiety is not correct", 3, testEngineer.getAnxiety());
    }

    @Test
    public void verifyDefaultAnxietyByAutomationTest() {
        Assert.assertEquals("Default Anxiety is not correct", 3, automationEngineer.getAnxiety());
    }

    @Test
    public void verifySetAnxietyByManualTest() {
        Assert.assertEquals("Set Anxiety is not correct", 11, testEngineer.getAnxiety());
    }

    @Test
    public void verifySetAnxietyByAutomationTest() {
        Assert.assertEquals("Set Anxiety is not correct", 11, automationEngineer.getAnxiety());
    }

    @Test
    public void verifySetSkillByManualTest() {
        testEngineer.setSkill(3);
        Assert.assertEquals("Set Skill is not correct", 3, testEngineer.getSkill());
    }

    @Test
    public void verifySetSkillByAutomationTest() {
        automationEngineer.setSkill(5);
        Assert.assertEquals("Set skill is not correct", 3, automationEngineer.getSkill());
    }

    @Test
    public void verifyRandomSkillTest() {
        Assert.assertEquals("Random Skill is not matched", true, 1 <= testEngineer.getSkill() &&
                automationEngineer.getSkill() < 11);
    }

    @Test
    public void verifyInstabilityTest() {
        com.DAY_4.entity.Test test = new ManualTest(TestLevel.UNIT, 0);
        Assert.assertEquals("Instability is not matched", 1, test.getInstability());
    }

    @Test
    public void verify2InstabilityTest() {
        com.DAY_4.entity.Test test = new AutomatedTest(TestLevel.GUI, 100);
        Assert.assertEquals("Instability is not matched", 10, test.getInstability());
    }

    @Test
    public void verifyComplexityTest(){
        com.DAY_4.entity.Test test = new ManualTest(TestLevel.API, 1);
        Assert.assertEquals("Complexity is matched", 3, test.getComplexity());
    }

    @Test
    public void verify2ComplexityTest(){
        com.DAY_4.entity.Test test = new AutomatedTest(TestLevel.UNIT, 1);
        Assert.assertEquals("Complexity is matched", 3, test.getComplexity());
    }
}
