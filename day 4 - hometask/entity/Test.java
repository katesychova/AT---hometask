package com.DAY_4.entity;

import com.DAY_4.worker.AutomationEngineer;
import com.DAY_4.worker.Engineer;
import com.DAY_4.worker.TestEngineer;


public abstract class Test implements Functionable<Engineer, Result> {
    private int complexity;
    private int instability;

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getInstability() {
        return instability;
    }

    public void setInstability(int instability) {
        if (instability <= 0) {
            instability = 1;
        } else if (instability > 10) {
            instability = 10;
        }
    }

    public Test(TestLevel testLevel, int instabitity) {
        this.complexity = testLevel.COMPLEXITY;
        this.setInstability(instability);
    }

    @Override
    public Result apply(Engineer engineer) {
        int anxiety;
        if ((this instanceof ManualTest && engineer instanceof AutomationEngineer) ||
                (this instanceof AutomatedTest && engineer instanceof TestEngineer)) {
            anxiety = engineer.getAnxiety();
        } else {
            anxiety = 1;
        }
        return complexity * instability * anxiety / engineer.getSkill() > 30 ? Result.FAILED : Result.PASSED;
    }
}
