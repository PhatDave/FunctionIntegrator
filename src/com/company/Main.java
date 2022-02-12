package com.company;

import com.company.Function.*;

public class Main {
    public static void main(String[] args) {
//        Input A B and f, T1 and T2
//        Calculate A * f(x) + B between T1 and T2
        String test = "- cos(x) - sin(x)";
        Function function = StringFunctionParser.parse(test);
        System.out.println(function.integrateOver(0, 2));
    }
}
