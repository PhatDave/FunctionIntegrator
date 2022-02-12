package com.company.Function.Argument;

public class NaturalLogArgument implements Argument {
    private Double value = 1.0;
    private boolean isNegative = false;
    private Argument argument;

    public NaturalLogArgument(String arg, Argument argument, boolean isNegative) {
        this.value = this.parseValue(arg);
        this.argument = argument;
        this.isNegative = isNegative;
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative())
            return -Math.log(Math.abs(argument.apply(val)));
        return Math.log(Math.abs(argument.apply(val)));
    }

    @Override
//    TODO: idk how this unholy abomination integrates
    public Argument integrate() {
        return null;
    }

    @Override
    public String toString(boolean forcePrefix) {
        StringBuilder sb = new StringBuilder();
        appendPrefix(sb, forcePrefix);
//        TODO: Would be nice to have it not print 1.0 (if value is 1) but i ran out of nerves
        sb.append(this.value);
        sb.append("ln(|");
        sb.append(this.argument.toString(false));
        sb.append("|)");
        return sb.toString();
    }

    @Override
    public boolean isNegative() {
        return isNegative;
    }
}
