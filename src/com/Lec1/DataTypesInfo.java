package com.Lec1;

public class DataTypesInfo {
    // Java has 8 primitive data types
    // 1. byte
    // 2. short
    // 3. int
    // 4. long
    // 5. float
    // 6. double
    // 7. char
    // 8. boolean

    // Default values of primitive data types in Java
    // byte - 0
    // short - 0
    // int - 0
    // long - 0L
    // float - 0.0f
    // double - 0.0d
    // char - '\u0000' (null character)
    // boolean - false

    // Size of primitive data types in Java
    // byte - 1 byte (8 bits)
    // short - 2 bytes (16 bits)
    // int - 4 bytes (32 bits)
    // long - 8 bytes (64 bits)
    // float - 4 bytes (32 bits)
    // double - 8 bytes (64 bits)
    // char - 2 bytes (16 bits)
    // boolean - not precisely defined, but typically 1 bit

    // Instance variables (to show default values)
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        DataTypesInfo obj = new DataTypesInfo();

        System.out.println("=== Integer Types ===");
        System.out.println("byte    : " + Byte.SIZE + " bits, Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE
                + ", Default = " + obj.defaultByte);
        System.out.println("short   : " + Short.SIZE + " bits, Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE
                + ", Default = " + obj.defaultShort);
        System.out.println("int     : " + Integer.SIZE + " bits, Min = " + Integer.MIN_VALUE + ", Max = "
                + Integer.MAX_VALUE + ", Default = " + obj.defaultInt);
        System.out.println("long    : " + Long.SIZE + " bits, Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE
                + ", Default = " + obj.defaultLong);

        System.out.println("\n=== Floating Point Types ===");
        System.out.println("float   : " + Float.SIZE + " bits, Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE
                + ", Default = " + obj.defaultFloat);
        System.out.println("double  : " + Double.SIZE + " bits, Min = " + Double.MIN_VALUE + ", Max = "
                + Double.MAX_VALUE + ", Default = " + obj.defaultDouble);

        System.out.println("\n=== Character Type ===");
        System.out.println("char    : " + Character.SIZE + " bits, Min = " + (int) Character.MIN_VALUE + ", Max = "
                + (int) Character.MAX_VALUE + ", Default = '" + obj.defaultChar + "' (unicode=" + (int) obj.defaultChar
                + ")");

        System.out.println("\n=== Boolean Type ===");
        System.out.println("boolean : Size not precisely defined (depends on JVM). Possible values: " + Boolean.FALSE
                + ", " + Boolean.TRUE + ", Default = " + obj.defaultBoolean);
    }

}
