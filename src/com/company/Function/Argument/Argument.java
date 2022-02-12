package com.company.Function.Argument;

public interface Argument {
    Double apply(int val);
    Argument integrate();
    String toString(boolean forcePrefix);
    boolean isNegative();

    default void appendPrefix(StringBuilder sb, boolean force) {
        if (this.isNegative())
            sb.append(" - ");
        else if (force)
            sb.append(" + ");
    }
}
