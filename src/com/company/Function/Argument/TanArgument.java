package com.company.Function.Argument;

public class TanArgument implements Argument {
    private boolean isNegative = false;

    public TanArgument(boolean isNegative) {
        this.isNegative = isNegative;
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -Math.tan(val);
        return Math.tan(val);
    }
}
