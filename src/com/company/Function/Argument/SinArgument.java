package com.company.Function.Argument;

public class SinArgument implements Argument {
    private Double value = 1.0;
    private boolean isNegative = false;

    public SinArgument(String arg, boolean isNegative) {
        this.isNegative = isNegative;
        this.value = this.parseValue(arg);
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -value * Math.sin(val);
        return value * Math.sin(val);
    }

    @Override
    public Argument integrate() {
        return new CosArgument(this.value + "", !this.isNegative);
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
