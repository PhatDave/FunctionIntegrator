package com.company;

import com.company.Function.*;

public class Main {
    public static void main(String[] args) {
//        y=f(x)=A*funk(x)+B
        String test = "20cos(x) + 10tan(x)";
        Function function = StringFunctionParser.parse(test);
        System.out.println(function);
        System.out.println(function.integrateOver(0, 2));
    }
}
