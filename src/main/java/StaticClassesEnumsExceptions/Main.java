package StaticClassesEnumsExceptions;

import static StaticClassesEnumsExceptions.Calculator.calculate;

public class Main {
    public static void main(String[] args) {

        double result = calculate(2,3, Calculator.Type.MULTIPLICATION);
        System.out.println("result; " + result);

        try{
            result = calculate(22,3, null);
            System.out.println("result; " + result);
        }
        catch (Exception err){
        System.out.println("Something bad has happened");
        }

        result = calculate(244,3, Calculator.Type.SUBTRACTION);
        System.out.println("result; " + result);

        result = calculate(244,3, Calculator.Type.DIVISION);
        System.out.println("result; " + result);
    }
}
