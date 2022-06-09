/**
 * Pizza class contains info of a single pizza
 * Each pizza has a size(String) as well as numbers of toppings (cheese, pepperoni, and ham; all are integers)
 * The class has methods to create a new pizza, get pizza description, change a pizza, and calculate its cost
 */
public class Pizza
{
    private String size;
    private int cheeseTopping, pepperoniTopping, hamTopping;


    /**
     * Constructor without arguments passed
     * The pizza is small and has no toppings by default
     */
    public Pizza() {this("small", 0, 0, 0);}


    /**
     * Create a pizza object and initialize it using the arguments passed
     * @param size = size of pizza object that is being initialized small, medium, or large.
     * @param cheeseTopping = number of cheese toppings on the pizza object that is being initialized
     * @param pepperoniTopping = number of pepperoni toppings on the pizza object that is being initialized
     * @param hamTopping = number of ham toppings on the pizza object that is being initialized
     */
    public Pizza(String size, int cheeseTopping, int pepperoniTopping, int hamTopping)
    {
        setSize(size);
        setCheeseTopping(cheeseTopping);
        setPepperoniTopping(pepperoniTopping);
        setHamTopping(hamTopping);
    }


    // copy constructor
    public Pizza(Pizza otherPizza)
    {
        if(otherPizza == null) {System.out.println("Cannot copy an empty pizza!");}
        else
        {
            setSize(otherPizza.size);
            setCheeseTopping(otherPizza.cheeseTopping);
            setPepperoniTopping(otherPizza.pepperoniTopping);
            setHamTopping(otherPizza.hamTopping);
        }
    }


    /**
     * Getter method to string representing size
     * @return = strings of size (small/medium/large)
     */
    public String getSize(){return this.size;}


    /**
     * Getter method to return int number of cheese toppings
     * @return integer of cheese toppings
     */
    public int getCheeseTopping(){return this.cheeseTopping;}


    /**
     * Getter method to return int number of pepperoni toppings
     * @return integer of pepperoni toppings
     */
    public int getPepperoniTopping(){return this.pepperoniTopping;}


    /**
     * Getter method to return int number of ham toppings
     * @return integer of ham toppings
     */
    public int getHamTopping(){return this.hamTopping;}


    /**
     * Setter method to update pizza size
     * @param size = size for the Pizza object
     */
    public void setSize(String size)
    {
        if(size.equals("small") || size.equals("medium") || size.equals("large"))
        {this.size = size;}
        else {System.out.println("Size is invalid (valid values: small, medium, large)");}
    }


    /**
     * Setter method to update the cheese topping on a pizza object
     * @param cheeseTopping = int number of cheese topping on the pizza object
     */
    public void setCheeseTopping(int cheeseTopping)
    {
        if(cheeseTopping >= 0) {this.cheeseTopping = cheeseTopping;}
        else{System.out.println("Cannot set the number of cheese topping to negative");}
    }


    /**
     * Setter method to update the pepperoni topping on a pizza object
     * @param pepperoniTopping = int number of pepperoni topping on the pizza object
     */
    public void setPepperoniTopping(int pepperoniTopping)
    {
        if(pepperoniTopping >= 0) {this.pepperoniTopping = pepperoniTopping;}
        else{System.out.println("Cannot set the number of pepperoni topping to negative");}
    }


    /**
     * Setter method to update the ham topping on a pizza object
     * @param hamTopping = int number of ham topping on the pizza object
     */
    public void setHamTopping(int hamTopping)
    {
        if(hamTopping >= 0) {this.hamTopping = hamTopping;}
        else{System.out.println("Cannot set the number of ham topping to negative");}
    }


    /**
     * Calaulate the cost of the pizza; cost = base cost + topping cost
     * Base cost: small - $10, medium - $12, large - $14
     * Topping cost: each topping costs $2
     * @return total cost of the pizza object
     */
    public double calcCost()
    {
        double baseCost = 10.0;
        if(size.equals("medium")){baseCost = 12.0;}
        if(size.equals("large")){baseCost = 14.0;}
        return baseCost + 2 * (this.cheeseTopping + this.pepperoniTopping + this.hamTopping);
    }


    /**
     * Get a string including the info of the pizza
     * @return returns a string describing the pizza object
     */
    public String getDescription()
    {return String.format("A %s pizza with %d cheese toppings, %d pepperoni toppings, %d ham toppings and costs $%.2f", size, cheeseTopping, pepperoniTopping, hamTopping, calcCost());}


    /**
     * Main method, do some manuual test
     * @param args
     */
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("medium", 2, 3 ,4);
        Pizza pizza3 = new Pizza(pizza2);
        System.out.println("Pizza1: " + pizza1.getDescription());
        System.out.println("Pizza2: " + pizza2.getDescription());
        System.out.println("Pizza3: " + pizza3.getDescription());
        System.out.println("The following should be 2: " + pizza2.getCheeseTopping());
        System.out.println("The following should be 3: " + pizza2.getPepperoniTopping());
        System.out.println("The following should be 4: " + pizza3.getHamTopping());
        System.out.println("The following should be 30.00: " + pizza3.calcCost());
    }
}
