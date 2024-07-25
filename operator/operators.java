public class operators {
    public static void main(String[] args) {
        int x = 100 + 5;
        System.out.println(x);

        int sum1 = 100 + 50; // 150
        int sum2 = sum1 + 250; // 150 + 250 = 400
        int sum3 = sum1 + sum2; // 150 + 400 = 550
        System.out.println(sum3);


        System.out.println("Aritmatics Operator");
        // Addition
        int addition = 10 + 5; // 10 + 5 = 15
        System.out.println("Addition: " + addition);

        // Subtraction
        int subtraction = 10 - 5; // 10 - 5 = 5
        System.out.println("Subtraction: " + subtraction);

        // Multiplication
        int multiplication = 10 * 5; // 10 * 5 = 50
        System.out.println("Multiplication: " + multiplication);

        // Division
        int division = 10 / 5; // 10 / 5 = 2
        System.out.println("Division: " + division);

        // Modulus
        int modulus = 10 % 3; // 10 % 3 = 1 (remainder of the division)
        System.out.println("Modulus: " + modulus);

        // Increment
        int increment = 10;
        increment++; // increment by 1, equivalent to increment = increment + 1
        System.out.println("Increment: " + increment);

        // Decrement
        int decrement = 10;
        decrement--; // decrement by 1, equivalent to decrement = decrement - 1
        System.out.println("Decrement: " + decrement);

        // Assignment Operators
        System.out.println("\nAssignment Operator");
        int a = 5;  // a = 5
        System.out.println("Initial a: " + a);

        a += 3;     // a = a + 3
        System.out.println("a += 3: " + a);

        a -= 3;     // a = a - 3
        System.out.println("a -= 3: " + a);

        a *= 3;     // a = a * 3
        System.out.println("a *= 3: " + a);

        a /= 3;     // a = a / 3
        System.out.println("a /= 3: " + a);

        a %= 3;     // a = a % 3
        System.out.println("a %= 3: " + a);

        a = 5;      // Reset a to 5
        a &= 3;     // a = a & 3
        System.out.println("a &= 3: " + a);

        a = 5;      // Reset a to 5
        a |= 3;     // a = a | 3
        System.out.println("a |= 3: " + a);

        a = 5;      // Reset a to 5
        a ^= 3;     // a = a ^ 3
        System.out.println("a ^= 3: " + a);

        a = 16;     // Reset a to 16 (10000 in binary)
        a >>= 3;    // a = a >> 3 (right shift by 3 bits)
        System.out.println("a >>= 3: " + a);

        a = 2;      // Reset a to 2 (10 in binary)
        a <<= 3;    // a = a << 3 (left shift by 3 bits)
        System.out.println("a <<= 3: " + a);

        //comparison operator
        System.out.println("\nComparison Operator");
        int b = 10;
        int c = 20;
        System.out.println("b == c: " + (b == c)); // false
        System.out.println("b != c: " + (b != c)); // true
        System.out.println("b > c: " + (b > c));   // false
        System.out.println("b < c: " + (b < c));   // true
        System.out.println("b >= c: " + (b >= c)); // false
        System.out.println("b <= c: " + (b <= c)); // true

        //logical operator
        System.out.println("Logical Operator");
        boolean condition1 = b < 15; // true
        boolean condition2 = c < 15; // false
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // false
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // true
        System.out.println("!(condition1 && condition2): " + !(condition1 && condition2)); // true
    }
}
