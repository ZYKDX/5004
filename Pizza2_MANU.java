/**
 * Pizza class contains size and numbers of toppings and methods to get pizza descriptions, create pizzas, change pizzas, and to calculate its costs
 */
public class Pizza {
    private int pepperoniTopping, hamTopping, cheeseTopping;
    private String size;

    /**
     * @param pepperoniTopping = number of pepperoni toppings on the pizza object that is being initialized
     * @param hamTopping = number of ham toppings on the pizza object that is being initialized
     * @param cheeseTopping = number of cheese toppings on the pizza object that is being initialized
     * @param size = size of pizza object that is being initialized Small(s), Medium (m), or Large (l).
     */
    public Pizza(int pepperoniTopping, int hamTopping, int cheeseTopping, String size) {
        setPepperoniTopping(pepperoniTopping);
        setHamTopping(hamTopping);
        setCheeseTopping(cheeseTopping);
        setSize(size);
    }

    /**
     * Constructor without arguments passed.
     */
    public Pizza(){
       pepperoniTopping = 0;
       hamTopping = 0;
       cheeseTopping =0;
       size = "S";
    }


    /**
     * @param pepperoniTopping = number of pepperoni toppings for single argument constructor only using pepperoni toppings as an argument
     */
    public Pizza(int pepperoniTopping) {
        setPepperoniTopping(pepperoniTopping);
    }

    /**
     * Method to set number of pepperoni toppings invoked on a pizza object.
     * @param pepperoniTopping = the number of pepperoni toppings (int)
     */
    public void setPepperoniTopping(int pepperoniTopping) {
        if (isValidAmount(pepperoniTopping)) {
            this.pepperoniTopping = pepperoniTopping;
        } else {
            System.out.println("Please enter a positive integer");

        }
    }

    /**
     * Setter method to update the ham topping on a pizza object
     * @param hamTopping = int number of ham toppings to add to pizza object
     */
    public void setHamTopping(int hamTopping) {
        if (isValidAmount(hamTopping)) {
            this.hamTopping = hamTopping;
        } else {
            System.out.println("Please enter a positive integer");

        }
    }

    /**
     * Setter method to update the cheese topping on a pizza object
     * @param cheeseTopping = int number of cheese toppings to add to pizza object
     */
    public void setCheeseTopping(int cheeseTopping) {
        if (isValidAmount(cheeseTopping)) {
            this.cheeseTopping = cheeseTopping;
        } else {
            System.out.println("Please enter a positive integer");

        }
    }
    

    /**
     * setter method to update pizza size
     * @param size = Pizza size for pizza object
     */
    public void setSize(String size) {
        if (isSizeValid(size)) {
            this.size =size;
        } else {
            System.out.println("Enter a valid size: s- small, m- medium, l- large");
        }
    }

    /**
     * getter method to return int number of pepperoni toppings
     * @return = integer of pepperoni toppings
     */
    public int getPepperoniTopping() {
        return this.pepperoniTopping;
    }


    /**
     * Getter method to return int number of ham toppings
     * @return = integer of ham toppings
     */
    public int getHamTopping() {
        return this.hamTopping;
    }

    /**
     *  Getter method to return int number of ham toppings
     * @return = integer of ham toppings
     */
    public int getCheeseTopping() {
        return this.cheeseTopping;
    }
    /**
     *  Getter method to string representing size
     * @return = strings of size (S/M/L)
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Method to calculate pizza cost
     * @return = double of pizza cost
     */
    public double calcCost() {
        return (((double) this.cheeseTopping * 2) + ((double) (this.pepperoniTopping) * 2) + ((double) (this.hamTopping) * 2) + sizeCost(this.size));
    }

    /**
     * Boolean to test whether the topping argument is valid for the setter methods
     * @param topping = integer input by user to set topping.
     * @return = boolean True if positive integer or 0. False if negative integer or other invalid.
     */
    public boolean isValidAmount(int topping) {
        ;
        if (topping >= 0) {
            return true;
        } else {
            System.out.println("Please enter a positive integer.");
        }
        return false;
    }

    /**
     * Boolean function to test whether string input by user is valid for size
     * @param size = String parameter input by user
     * @return = boolean returns True if strings containing any of the following are entered {s,S,m,M,l,L}, else returns False
     */
    public boolean isSizeValid(String size) {
        boolean isValid = false;
        switch (size) {
            case "s":
            case "S":
            case "m":
            case "M":
            case "l":
            case "L":
                isValid = true;
                return isValid;
        }
        return isValid;
    }

    /**
     * Method used by calcCost to get the cost of the pizza object size
     * @param size = string of s, m, l, S, M, L
     * @return = returns costs of the size of the pizza object for which its being called on.
     */
    public double sizeCost(String size) {
        switch (getSize()) {
            case "s":
            case "S":
                return 10.00;
            case "m":
            case "M":
                return 12.00;
            case "l":
            case "L":
                return 14.00;
        }
        System.out.println("invalid size");
        return -1;
    }

    /**
     * @return Returns string description of pizza object
     */
    public String getDescription(){
       return ("The " +this.size + " pizza" + " has " + this.pepperoniTopping +" pepperoni topping(s) " + this.hamTopping
               + " ham topping(s) " + this.cheeseTopping +" cheese topping(s) and costs " + this.calcCost());
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(1, 3 , 3, "m");
        Pizza pizza2 = new Pizza(1,2,1, "L");
        System.out.println("The following should be 26.0: "+pizza1.calcCost());
        System.out.println("the following should be 22.0: "+pizza2.calcCost());
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        pizza1.getPepperoniTopping();
        System.out.println("The following should be 3:" + pizza1.getCheeseTopping());
        System.out.println("The following should be 2:" + pizza2.getHamTopping());
    }

}




