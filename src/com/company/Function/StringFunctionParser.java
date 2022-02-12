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
            switch (arg) {
                case arg.contains("sin"):
            }
        }


        return function;
    }
}
