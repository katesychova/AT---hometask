package com.DAY_4.worker;

import com.DAY_4.entity.Result;
import com.DAY_4.entity.Test;
import com.DAY_4.people.Person;

public abstract class Engineer extends Person {
    private int anxiety = 3;
    private int skill = 0 + (int) (Math.random() * ((10 - 0) + 1));

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

    public Result executeTest(Test test) {
        return null;
    }
}
