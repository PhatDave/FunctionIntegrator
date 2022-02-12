package com.company;

import com.company.Function.*;

public class Main {
    public static void main(String[] args) {
//        Input A B and f, T1 and T2
//        Calculate A * f(x) + B between T1 and T2
        String test = "10x^13 + 5x^12 + 3x^4";
        Function function = StringFunctionParser.parse(test);
        System.out.println(function.integrateOver(0, 2));
    }
}
