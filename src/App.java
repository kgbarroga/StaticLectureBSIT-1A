public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Back!!!");
        /**
         * Create several Objects of the Bicycle Class
         */
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();

        /**
         * Calling a Static method from Class
         */
        System.out.println("I have " + Bicycle.bikers + " bikers...");

    }
}
