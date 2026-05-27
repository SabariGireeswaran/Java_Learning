public class variables {
    public static void main(String args[])
    {
        // Integer
        long a = 6488_464487456643689L; // We can use l or L 
        int b = 243_5353;               //for specifying long
        byte c = 127;                   // Maximum value for byte is 127
        short d = 32767;                // Maximum value for short is 32767

        //Float
        float e = 33.213_134f;
        double f = 3.1_4;

        //Character
        char g = 'h';
        String h = "d";

        //Boolean
        boolean i = true;

        // Type Conversion and Casting
        int a1 =1232;
        byte b1 =12;
        a1 = b1;    // Implicit type conversion (widening)
        b1 = (byte)a1;  // Explicit type conversion (narrowing)
        int c1 = 259;
        byte d1 = (byte)c1; // This will cause overflow and wrap around, 
        // resulting in 3 because only the low 8 bits are kept
        // Integer values outside the byte range are reduced to an 8-bit value.
        // In this case, 259 % 256 = 3, and 3 is within the signed byte range (-128 to 127),
        // so the cast result is 3.

        //Printing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); 
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        System.out.println("Type Conversion and Casting:");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
     
    }
    
}
