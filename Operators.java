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
        
        //Logical Operators
        System.out.println("\n Logical Operators: ");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR    
        System.out.println("!x: " + (!x)); // Logical NOT
        System.out.println("!y: " + (!y)); // Logical NOT
        System.out.println("!(x && y): " + (!(x && y))); // Logical NOT with AND
        System.out.println("!(x || y): " + (!(x || y))); // Logical NOT with OR
        System.out.println("x ^ y: " + (x ^ y)); // Logical XOR
        System.out.println("!(x ^ y): " + (!(x ^ y))); // Logical NOT with XOR
        
        //Short-circuiting Operators
        System.out.println("\nShort-circuiting Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!(x && y): " + (!(x && y))); // Logical NOT with AND
        System.out.println("!(x || y): " + (!(x || y))); // Logical NOT with OR
        System.out.println("x ^ y: " + (x ^ y)); // Logical XOR
        System.out.println("!(x ^ y): " + (!(x ^ y))); // Logical NOT with XOR
        // In short-circuiting, if the first operand is sufficient to determine the result,
        //  the second operand is not evaluated.

        //XNor Operator
        System.out.println("\nXNor Operator:");
        System.out.println("x XNOR y: " + !(x ^ y)); // Logical XNOR
        
    }
}
