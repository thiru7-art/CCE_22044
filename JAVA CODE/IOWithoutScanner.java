public class IOWithoutScanner {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Type a character and press Enter:");
        char ch = (char) System.in.read(); // Reads a single character
        System.out.println("You entered: " + ch);
    }
}
