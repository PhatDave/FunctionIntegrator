package com.company.Function.Argument;

public class NaturalLogArgument implements Argument {
    private boolean isNegative = false;
    private Argument argument;

    public NaturalLogArgument(Argument argument, boolean isNegative) {
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
