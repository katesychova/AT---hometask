package com.DAY_4.entity;

import com.DAY_4.worker.Engineer;

public interface Functionable<Engineer, Result> {
    public Result apply(Engineer engineer);
}
