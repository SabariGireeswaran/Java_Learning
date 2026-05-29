public class Operators {
    public static void main(String args[])
    {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        //Shorthand Operators
        System.out.println("\nShorthand Operators:");
        a += b; // a = a + b
        System.out.println("a += b: " + a);
        a -= b; // a = a - b
        System.out.println("a -= b: " + a);
        a *= b; // a = a * b
        System.out.println("a *= b: " + a);
        a /= b; // a = a / b
        System.out.println("a /= b: " + a);
        a %= b; // a = a % b
        System.out.println("a %= b: " + a);     

        // Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("a++: " + (a++)); // Post-increment
        System.out.println("a: " + a); // a is now 1
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("a--: " + (a--)); // Post-decrement
        System.out.println("a: " + a); // a is now 1
        System.out.println("--a: " + (--a)); // Pre-decrement   
        
        //Relational Operator:
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a === b: " + (a == b)); // Identity operator (not applicable for primitive types)
    }
}
