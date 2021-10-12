package it.sliit;

import java.util.Arrays;
import java.lang.Math;

public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }
    
    public static double absolute(double operand1) {
        return Math.abs(operand1);
    }

}
