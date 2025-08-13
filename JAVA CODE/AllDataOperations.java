public class AllDataOperations {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // Bitwise
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));
        System.out.println("a << 1 : " + (a << 1));
        System.out.println("a >> 1 : " + (a >> 1));

        // Assignment
        int c = 10;
        c += 5;
        System.out.println("c after += 5: " + c);
    }
}
