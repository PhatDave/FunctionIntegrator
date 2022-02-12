package com.company.Function.Argument;

import java.util.regex.*;

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

    default Double parseValue(String arg) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(arg);
        m.find();
        try {
            return Double.parseDouble(m.group());
        } catch(IllegalStateException e) {
            return 1.0;
        }
    }
}
