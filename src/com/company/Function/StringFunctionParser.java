package com.company.Function;

import com.company.Function.Argument.*;

import java.util.*;

public class StringFunctionParser {
    public static Function parse(String input) {
        Function function = new Function();
        var segmentString = input.split(" ");

        boolean isNegative = false;
        for (String arg : segmentString) {
//            TODO: this is really bad :(
            if (arg.contains("-")) {
                isNegative = true;
                continue;
            }
            if (arg.contains("sin")) {
                function.addArgument(new SinArgument(arg, isNegative));
            } else if (arg.contains("cos")) {
                function.addArgument(new CosArgument(arg, isNegative));
            } else if (arg.contains("tan")) {
                function.addArgument(new TanArgument(arg, isNegative));
            } else if (arg.contains("arctan")) {
                function.addArgument(new ArctanArgument(arg, isNegative));
            } else if (arg.contains("x")) {
                function.addArgument(new PolynomialArgument(arg, isNegative));
            }
            isNegative = false;
        }


        return function;
    }
}
