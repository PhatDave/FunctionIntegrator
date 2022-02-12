package com.company.Function.Argument;

public class ArctanArgument implements Argument {
    private boolean isNegative = false;

    public ArctanArgument(boolean isNegative) {
        this.isNegative = isNegative;
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -Math.atan(val);
        return Math.atan(val);
    }
}
