package com.company.Function.Argument;

public class CosArgument implements Argument {
    private Double value = 1.0;
    private boolean isNegative = false;

    public CosArgument(String arg, boolean isNegative) {
        this.isNegative = isNegative;
        this.value = this.parseValue(arg);
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -value * Math.cos(val);
        return value * Math.cos(val);
    }

    @Override
    public Argument integrate() {
        return new SinArgument(this.value + "", this.isNegative);
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
        sb.append(this.value);
        sb.append("cos(x)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
