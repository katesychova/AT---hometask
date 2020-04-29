package test;

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
