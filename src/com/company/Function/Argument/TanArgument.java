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

    @Override
    public Argument integrate() {
        return new NaturalLogArgument(new CosArgument(false), true);
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
        sb.append("tan(x)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
