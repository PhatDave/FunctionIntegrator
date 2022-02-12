package com.company.Function;

import com.company.Function.Argument.*;

import java.util.*;

public class Function {
    public ArrayList<Argument> arguments = new ArrayList<Argument>();

    public void addArgument(Argument argument) {
        arguments.add(argument);
    }

    public Double apply(int point) {
        Double value = 0.0;
        for (Argument argument : arguments) {
            value += argument.apply(point);
        }
        return value;
    }

    public void integrate() {
        for (Argument argument : arguments) {
            argument.integrate();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean forcePrefix = false;
        for (Argument argument : arguments) {
            sb.append(argument.toString(forcePrefix));
            forcePrefix = true;
        }
        return sb.toString();
    }
}
