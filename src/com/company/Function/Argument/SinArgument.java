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

    @Override
    public Argument integrate() {
        return new CosArgument(!this.isNegative);
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
        sb.append("sin(x)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
