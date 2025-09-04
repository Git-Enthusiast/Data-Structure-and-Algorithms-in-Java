package com.Lec1;

public class TypeCasting {
        public static void main(String[] args) {

                // -------------------------------
                // 1) WIDENING (Implicit / Safe)
                // -------------------------------
                // Smaller → Larger type: automatic, no data loss.
                int smallInt = 100;
                double widenedDouble = smallInt; // int -> double happens automatically
                System.out.println("[Widening] int -> double: " + widenedDouble); // 100.0

                long bigLong = 5_000_000_000L; // 'L' suffix creates a long literal (beyond int range)
                float widenedFloat = bigLong; // long -> float (possible precision loss, but widening cast is legal)
                System.out.println("[Widening] long -> float (precision may drop): " + widenedFloat);

                // --------------------------------------------------
                // 2) NARROWING (Explicit / Risky: may lose precision)
                // --------------------------------------------------
                // Larger → Smaller type: you MUST cast, can lose data.
                double preciseDouble = 1091.54;
                int narrowedInt = (int) preciseDouble; // fractional part is truncated
                System.out.println("[Narrowing] double -> int: " + narrowedInt); // 1091

                // Overflow example during narrowing:
                int twoFiftySeven = 257;
                // byte range: -128..127. Java keeps only the low 8 bits: 257 % 256 = 1
                byte narrowedByteOverflow = (byte) twoFiftySeven;
                System.out.println("[Narrowing-Overflow] int 257 -> byte: " + narrowedByteOverflow); // 1

                // --------------------------------------------------------
                // 3) TYPE PROMOTION IN ARITHMETIC (binary numeric promotion)
                // --------------------------------------------------------
                // In any arithmetic expression:
                // - byte, short, char are promoted to int BEFORE the operation.
                // - The final result's type is the widest of the operands (in the chain):
                // int -> long -> float -> double
                byte a = 40, b = 50, c = 100;
                // a*b: both bytes promoted to int, (40*50)=2000 (int), then /100 -> 20 (int)
                int promotedResult = (a * b) / c;
                System.out.println("[Promotion] (byte*byte)/byte -> int: " + promotedResult); // 20

                // -------------------------------------
                // 4) CHAR <-> INT and Unicode code units
                // -------------------------------------
                // 'A' is Unicode code point 65 (for BMP chars, char stores UTF-16 code unit)
                int codeOfA = 'A'; // char promoted to int
                System.out.println("[char->int] 'A' -> " + codeOfA); // 65

                // Inverse: int -> char (narrowing). 66 corresponds to 'B'.
                char charFromInt = (char) 66;
                System.out.println("[int->char] 66 -> '" + charFromInt + "'"); // 'B'

                // Note: Java 'char' is 16-bit. Not all Unicode code points fit into a single
                // char.

                // -----------------------------------------------------
                // 5) MIXED-TYPE EXPRESSION: who decides the result type?
                // -----------------------------------------------------
                byte b2 = 42; // byte
                char ch = 'a'; // 'a' == 97
                short s = 1091; // short
                int i = 59_990; // int
                float f = 23.3233f; // 'f' suffix makes it a float literal
                double d = 1.333255; // double by default

                // Breakdown:
                // (f * b2) -> byte promoted to float, result is float
                // (i / ch) -> char promoted to int, int/int -> int (truncates)
                // (d * s) -> short promoted to double, result is double
                // float + int -> float, then float - double -> double
                double mixed = (f * b2) + (i / ch) - (d * s);

                System.out.println(
                                "[Mixed Breakdown] (f*b2)=" + (f * b2) + ", (i/ch)=" + (i / ch) + ", (d*s)=" + (d * s));
                System.out.println("[Mixed Result Type] final is double: " + mixed);

                // -------------------------------------------------------
                // 6) CAST PRECEDENCE: (int)(d*s) vs ((int)d)*s are different
                // -------------------------------------------------------
                double x = 5.9;
                int sInt = 3;

                // (int)(x * sInt): multiply in double, THEN cast result to int
                int castAfter = (int) (x * sInt); // (5.9*3=17.7) -> 17
                // ((int)x) * sInt: cast x to int first (5), THEN multiply as int
                int castBefore = ((int) x) * sInt; // (5*3) -> 15

                System.out.println("[Precedence] (int)(x*s) = " + castAfter + ", ((int)x)*s = " + castBefore);

                // -------------------------------------------------------------
                // 7) CONSTANT NARROWING RULE (why literals sometimes don't need cast)
                // -------------------------------------------------------------
                // If the right-hand side is a compile-time constant within range, Java allows
                // it:
                byte ok1 = 127; // within -128..127, allowed (no cast)
                final int CONST = 100; // final + within range => allowed to assign to byte
                byte ok2 = CONST; // allowed because CONST is a constant expression
                System.out.println("[Const Narrowing] byte ok1=127, ok2=CONST(100): " + ok1 + ", " + ok2);

                int var = 100; // NOT final, value only known at runtime
                // byte notOk = var; // ❌ compile error: requires explicit cast
                byte forced = (byte) var; // ✅ explicit cast required when RHS is not a compile-time constant
                System.out.println("[Non-const Narrowing] int var=100 -> byte forced: " + forced);

                // -------------------------------------------------
                // 8) LITERAL SUFFIXES: why they matter for typing
                // -------------------------------------------------
                // - No suffix: integer literals are int by default, decimals are double by
                // default.
                // - 'L' / 'l' -> long literal
                // - 'F' / 'f' -> float literal, otherwise you'd need (float) cast
                float fLit = 3.14f; // without 'f', 3.14 is double and needs a cast
                long bigLit = 9_000_000_000L; // long literal needed; fits in long, not in int
                System.out.println("[Literals] float 3.14f=" + fLit + ", long 9e9L=" + bigLit);

                // ----------------------------------------------------------------
                // 9) CASTING vs PARSING (Strings are NOT numbers)
                // ----------------------------------------------------------------
                String numText = "123";
                // int castFromString = (int) numText; // ❌ compile error: cannot cast String to
                // int
                int parsed = Integer.parseInt(numText); // ✅ convert digits in String to int value
                double parsedD = Double.parseDouble("3.14159"); // ✅ parse to double
                System.out.println("[Parsing] \"123\" -> " + parsed + ", \"3.14159\" -> " + parsedD);

                // ----------------------------------------------------------------
                // 10) BOOLEAN cannot be cast to/from numeric types
                // ----------------------------------------------------------------
                boolean flag = true;
                // int n = (int) flag; // ❌ not allowed in Java
                System.out.println("[Boolean] No numeric casting allowed. flag=" + flag);

                // ----------------------------------------------------------------
                // 11) FLOAT rounding demo: mixing int and float → upcasts to float
                // ----------------------------------------------------------------
                // Right operand has 'f' suffix, so expression is evaluated in float precision.
                float product = 3 * 3093.334324324f; // 3 is int, promoted to float, result is float
                System.out.println("[Float Mix] 3 * 3093.334324324f = " + product);
                // Note: printed value may show rounding due to 32-bit float precision.

                // -----------------------------------------
                // 12) BONUS: String and Unicode literal demo
                // -----------------------------------------
                // Not casting, but shows Java's Unicode support (UTF-16)
                System.out.println("[Unicode] नमस्ते"); // Devanagari "Namaste"
        }
}
