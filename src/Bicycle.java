public class Bicycle {
    private int status;
    public String color;

    /**
     * Create a static variable
     * public/private static keyword datatype variable_name
     */
    public static int numberOfBikes;

    /**
     * Constructor that Accepts color parameter
     * @param color
     */

    Bicycle(String color){
        numberOfBikes++;
        this.color = color;
    }
}
