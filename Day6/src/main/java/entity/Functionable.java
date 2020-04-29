package entity;

public interface Functionable<Engineer, Result> {
    public Result apply(Engineer engineer);
}
