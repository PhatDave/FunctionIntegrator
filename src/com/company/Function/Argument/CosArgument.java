package com.company.Function.Argument;

public class CosArgument implements Argument {
    private boolean isNegative = false;

    public CosArgument(boolean isNegative) {
        this.isNegative = isNegative;
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -Math.cos(val);
        return Math.cos(val);
    }
}
