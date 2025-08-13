public class AccessTest {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println("Public var: " + obj.publicVar);
        System.out.println("Protected var: " + obj.protectedVar);
        System.out.println("Default var: " + obj.defaultVar);

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();

        // Private members cannot be accessed here
        // obj.privateVar; // 
        // obj.privateMethod(); // 
    }
}
