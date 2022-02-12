package com.company.Function.Argument;

public class ArctanArgument implements Argument {
    private Double value = 1.0;
    private boolean isNegative = false;

    public ArctanArgument(String arg, boolean isNegative) {
        this.isNegative = isNegative;
        this.value = this.parseValue(arg);
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -value * Math.atan(val);
        return value * Math.atan(val);
    }

    @Override
    public Argument integrate() {
        return new NaturalLogArgument(new SinArgument(this.value + "", false), false);
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
