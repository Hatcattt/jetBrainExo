package dev.hatcattt.jtbrn.exos;


import java.util.function.IntBinaryOperator;

/***
 * Write a lambda expression that accepts two integer arguments and returns max of them.
 * Try not to use the Math library.
 * Solution format. Submit your lambda expression in any valid format with ; on the end.
 * -> Examples: (x, y) -> x + y; (x) -> { return x; };
 */
public class Operator {

    public static IntBinaryOperator binaryOperator2 = new IntBinaryOperator() {
        @Override
        public int applyAsInt(int left, int right) {
            return left > right ? left : right;
        }
    };

    // same effect
    public static IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;
}
