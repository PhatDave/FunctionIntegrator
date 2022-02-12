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

    @Override
    public Argument integrate() {
        return new SinArgument(this.isNegative);
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
        sb.append("cos(x)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
