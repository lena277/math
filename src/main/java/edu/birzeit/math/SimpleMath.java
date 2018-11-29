package edu.birzeit.math;


public class SimpleMath {

    public static <T> T add_lena (T number1, T number2) {

        T result = null;

        if (number1.getClass() == Integer.class) {
            result = (T) (Integer) ((Integer) number1 + (Integer) number2);
        }
        if (number1.getClass() == Double.class) {
            result = (T) Double.valueOf(((Double) number1).doubleValue() +
                    ((Double) number2).doubleValue());
        }
        if (number1.getClass() == Long.class) {
            result = (T) Long.valueOf(((Long) number1).longValue() +
                    ((Long) number2).longValue());
        }


        return result;

    }

    public static void main(String[]args){
    System.out.print(factorial_lena(3));
    }

    public static double factorial_lena(double number)
    {

        if (number <= 1)
            return 1;

        return number * factorial_lena(number - 1);
    }
    public static <T> T divide_lena (T number1, T number2) {

        T result = null;
           if (number2.getClass() == Integer.class && number2 != Integer.valueOf(0)) {
               result = (T) (Integer) ((Integer) number1 / (Integer) number2);
           }
           if (number2.getClass() == Double.class && number2 != Double.valueOf(0.0)) {
               result = (T) Double.valueOf(((Double) number1).doubleValue() /
                       ((Double) number2).doubleValue());
           }
           if (number2.getClass() == Long.class  && number2 != Long.valueOf(0l)) {
               result = (T) Long.valueOf(((Long) number1).longValue() /
                       ((Long) number2).longValue());
           }


        return result;

    }

    public static <T> T subtract_lena (T number1, T number2) {

        T result = null;

        if (number1.getClass() == Integer.class) {
            result = (T) (Integer) ((Integer) number1 - (Integer) number2);
        }
        if (number1.getClass() == Double.class) {
            result = (T) Double.valueOf(((Double) number1).doubleValue() -
                    ((Double) number2).doubleValue());
        }
        if (number1.getClass() == Long.class) {
            result = (T) Long.valueOf(((Long) number1).longValue() -
                    ((Long) number2).longValue());
        }


        return result;

    }
    public static <T> T multiply_lena (T number1, T number2) {

        T result = null;

        if (number1.getClass() == Integer.class) {
            result = (T) (Integer) ((Integer) number1 * (Integer) number2);
        }
        if (number1.getClass() == Double.class) {
            result = (T) Double.valueOf(((Double) number1).doubleValue() *
                    ((Double) number2).doubleValue());
        }
        if (number1.getClass() == Long.class) {
            result = (T) Long.valueOf(((Long) number1).longValue() *
                    ((Long) number2).longValue());
        }


        return result;

    }

}