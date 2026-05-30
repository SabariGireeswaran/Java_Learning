public class Conditional_statements {
    public static void main(String arg[]){
        //Conditional Statements
        int a = 10;
        int b = 20;
        System.out.println("Conditional Statements:");
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");     
        }   

        //Ternary Operator
        System.out.println("Ternary Operator:");
        String result = (a > b) ? "a is greater than b" : "a is less than or equal to b";
        System.out.println(result);
}
}
