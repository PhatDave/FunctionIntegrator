package com.company.Function.Argument;

public class PolynomialArgument implements Argument {
    private Double value = 0.0;
    private int power = 1;
    private boolean isNegative = false;

    public PolynomialArgument(String arg, boolean isNegative) {
        this.isNegative = isNegative;
        if (arg.contains("^")) {
            var stringSplit = arg.split("\\^");
            power = Integer.parseInt(stringSplit[1]);
        }
        if (arg.contains("x")) {
            var stringSplit = arg.split("x");
            value = this.getValue(stringSplit[0]);
        }
    }

    private Double getValue(String input) {
        if (input.length() > 0) {
            return Double.parseDouble(input);
        }
        return 1.0;
    }

    @Override
    public Double apply(int val) {
        if (this.isNegative)
            return -Math.pow(value * val, power);
        return Math.pow(value * val, power);
    }
}
