package com.DAY_4.worker;

import com.DAY_4.entity.Result;
import com.DAY_4.entity.Test;
import com.DAY_4.people.Person;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Engineer extends Person {
    private int anxiety = 3;
    private int skill;

    public int getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(int anxiety) {
        this.anxiety = anxiety;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setRandomSkills() {
        this.skill = ThreadLocalRandom.current().nextInt(1, 11);
    }

    public Result executeTest(Test test) {
        return test.apply(this);
    }
}
