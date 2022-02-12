package com.company.Function;

import com.company.Function.Argument.*;

import java.util.*;

public class Function {
    private ArrayList<Argument> arguments = new ArrayList<Argument>();

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
}
