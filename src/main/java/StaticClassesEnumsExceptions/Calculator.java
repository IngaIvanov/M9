package StaticClassesEnumsExceptions;

import org.apache.logging.log4j.Logger;

import java.util.logging.LogManager;

import static java.util.logging.LogManager.*;

public class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

    private static final Logger Logger = org.apache.logging.log4j.LogManager.getLogger(Calculator.class);

    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(int a, int b, Type type) {
        Logger.info("Running method CALCULATE");
        double result = 0;
//       We can do it with if/else or
//        if (type == MULTIPLICATION) {
//            return a * b;
//        }
//        else if (type == SUMMARY)
//        by switch case
        try {

            switch (type) {
                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;
                case DIVISION:
                    result = a / b;
                    break;
                case SUBTRACTION:
                    result = a - b;
                    break;
                default:
                    result = -1;

            }
        } catch (Exception err) {
            System.out.println("Something bad has happened");
            throw err; //ostanavlivaem programmu
        }
//        finally { //ispolzuetse redco
//            System.out.println("Finally block");
//            result = -1;
//        }
        return result;
    }
}
