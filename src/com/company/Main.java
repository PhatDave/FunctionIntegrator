package com.company;

import com.company.Function.*;

public class Main {
    public static void main(String[] args) {
        String test = "tan(x)";
        Function function = StringFunctionParser.parse(test);
        System.out.println(function.integrateOver(0, 2));
    }
}
