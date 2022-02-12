package com.company.Function.Argument;

public class SinArgument implements Argument {
    private boolean isNegative = false;

    public SinArgument(boolean isNegative) {
        this.isNegative = isNegative;
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -Math.sin(val);
        return Math.sin(val);
    }
}
