public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Back!!!");
        /**
         * Bike Example
         */
        Bicycle bike1 = new Bicycle("white");
        Bicycle bike2 = new Bicycle("orange");
        /**
         * Static way of getting Static Variables
         */
        System.out.println("Number of Bikes = " + Bicycle.numberOfBikes);
        /**
         * Output of instance Variables
         */
        System.out.println("Bike 1 Color " + bike1.color);
        System.out.println("Bike 2 Color " + bike2.color);

        System.out.println("===========================");
        /**
         * Friend Example
         */
        /**
         * Create Friends
         */
        Friend f1 = new Friend("Spongebob");
        Friend f2 = new Friend("Patrick");
        Friend f3 = new Friend("Sandy");
        /**
         * Access a static Variable
         */
        System.out.println("I have now " + Friend.friendCount + " friends.");
        System.out.println("=========");
        /**
         * Access a static method
         */
        System.out.println("Friends belong to section " + Friend.getSection());
        
        
    }
}
