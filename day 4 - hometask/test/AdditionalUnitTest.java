package com.DAY_4.test;

import com.DAY_4.entity.AutomatedTest;
import com.DAY_4.entity.ManualTest;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.AutomationEngineer;
import com.DAY_4.worker.Engineer;
import com.DAY_4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AdditionalUnitTest {

    private Engineer en;

    public AdditionalUnitTest(Engineer en) {
        this.en = en;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumber() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer()},
                {new AutomationEngineer()}
        });
    }

    @Test
    public void verifyDefaultAnxiety() {
        Assert.assertEquals("Default Anxiety is not correct", 3, en.getAnxiety());
    }

    @Test
    public void verifySetAnxiety() {
        en.setAnxiety(11);
        Assert.assertEquals("Set Anxiety is not correct", 11, en.getAnxiety());
    }

    @Test
    public void verifySetSkill() {
        en.setSkill(3);
        Assert.assertEquals("Set Skill is not correct", 3, en.getSkill());
    }

    @Test
    public void verifyRandomSkillTest() {
        Assert.assertEquals("Random Skill is not matched", true, 1 <= en.getSkill() &&
                en.getSkill() < 11);
    }
}
