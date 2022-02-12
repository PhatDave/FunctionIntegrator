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

    @Override
    public Argument integrate() {
        return new NaturalLogArgument(new SinArgument(false), false);
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
        sb.append("atan(x)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
