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
        ArrayList<Argument> newArguments = new ArrayList<Argument>();
        for (Argument argument : arguments) {
            newArguments.add(argument.integrate());
        }
        this.arguments = newArguments;
    }

    public Double integrateOver(int start, int end) {
        this.integrate();
        System.out.println(this);
        return this.apply(end) - this.apply(start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("f(x) = ");
        boolean forcePrefix = false;
        for (Argument argument : arguments) {
            sb.append(argument.toString(forcePrefix));
            forcePrefix = true;
        }
        return sb.toString();
    }
}
