package com.company;

import com.company.Function.*;

public class Main {
    public static void main(String[] args) {
//        Input A B and f, T1 and T2
//        Calculate A * f(x) + B between T1 and T2
        String test = "10x^2 - 15x + 3";
        StringFunctionParser.parse(test);
    }
}
