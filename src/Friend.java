public class Friend {
    /**
     * instance variables
     */
    private String name;

    /**
     * static variables
     */
    private static int friendCount = 0;
    private static String section = "BSIT 1A";

    Friend(String nameInput){
        friendCount++;
        this.name = nameInput;
    }

    public String getName() {
        return name;
    }
    /**
     * Create a static method to access static fields/properties/variables
     */
    public static String getSection(){
        return section;
    }

    public static int getFriendCount(){
        return friendCount;
    }

    
}
