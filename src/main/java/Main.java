public class Main {
    public static void main(String[] args) {
        // Java types

        char aChar = 'c';     // The char data type is a single 16-bit Unicode character. Default value is '\u0000'
        boolean flag = true;   // true or false. Default value is false
        boolean flagFalse = false;

        byte aByte = 13;     // 8 bit(2^8). Minimum -128 and a maximum value of 127 (inclusive). Default value is 0
        short aShort = 113;   // 16 bit(2^16). Minimum value of -32,768 and a maximum value of 32,767 (inclusive). Default value is 0
        int aInt = 1113;       // 32 bit(2^32). Minimum value of -2^31 and a maximum value of 2^31-1. Default value is 0
        long aLong = 11113L;     // 64 bit(2^64). Minimum value of -2^63 and a maximum value of 2^63-1. Default value is 0L

        float aFloat = 11.13F;   //The float data type is a single-precision 32-bit IEEE 754 floating point.
        double aDouble = 1.13D;     //The float data type is a single-precision 64-bit IEEE 754 floating point.

        String aString = "Dima";     // The String class is not technically a primitive data type, but considering the special support given to it by the language
        String bString = "Zima";

        System.out.println("The sum of the " + aByte + " and " + aShort + " is " + sum(aByte, aShort));
        System.out.println("The subtraction of the " + aFloat + " and " + aLong + " is " + subtraction(aFloat, aLong));
        System.out.println("The multiplication of the " + aDouble + " and " + aInt + " is " + multiplication(aDouble, aInt));
        System.out.println("The division of the " + aInt + " and " + aShort + " is " + division(aInt, aShort));
        System.out.println("The modulo of the " + aInt + " and " + aShort + " is " + modulo(aInt, aShort));
        System.out.println("Poor, poor " + aChar + "har(");

        if (flag) {
            System.out.println("Flag! Yes, it`s true flag");
        }

        if (!(flagFalse)) {
            System.out.println("Flag! Yes, it`s false flag");
        }

        if (aString.equals("Dima") && bString.equals("Zima")) {
            System.out.println("&& Yes, it`s true");
        }

        if (aString.equals("Pima") || bString.equals("Zima")) {
            System.out.println("|| Yes, it`s true");
        }

        overflow();
    }

    static void overflow() {
        byte value = 1;
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        byte valueOutOfRangeMax = (byte) (value + maxValue);
        byte valueOutOfRangeMin = (byte) (minValue - value);
        int valueOutOfRangeMaxInt = value + maxValue;
        int valueOutOfRangeMinInt = minValue - value;
        System.out.println("Max value from cast to byte is " + valueOutOfRangeMax);
        System.out.println("Min value from cast to byte is " + valueOutOfRangeMin);
        System.out.println("Max value from migrate to int is " + valueOutOfRangeMaxInt);
        System.out.println("Min value from migrate to int is " + valueOutOfRangeMinInt);
    }

    // Mathematics operations
    static int sum(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    static int modulo(int a, int b) {
        return a % b;
    }

    //Methods overloading
    static double sum(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double modulo(double a, double b) {
        return a % b;
    }
}
