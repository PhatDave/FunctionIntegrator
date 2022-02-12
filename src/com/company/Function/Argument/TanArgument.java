package com.company.Function.Argument;

public class TanArgument implements Argument {
    private Double value = 1.0;
    private boolean isNegative = false;

    public TanArgument(String arg, boolean isNegative) {
        this.isNegative = isNegative;
        this.value = this.parseValue(arg);
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -value * Math.tan(val);
        return value * Math.tan(val);
    }

    @Override
    public Argument integrate() {
        return new NaturalLogArgument(this.value + "", new CosArgument("", false), true);
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
        sb.append(this.value);
        sb.append("tan(x)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
