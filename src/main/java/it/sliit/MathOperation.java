package it.sliit;

import java.util.Arrays;


public class MathOperation {
 
    public static int div(a, b)

{
      return a/b;

} 

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

}
