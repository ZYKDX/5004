/**
 * Allows up to 3 pizzas to be saved in an order.
 * The pizza objects are created following the Pizza class
 */
public class PizzaOrder {

    private int numPizzas;
    private Pizza pizza1 = new Pizza();
    private Pizza pizza2 = new Pizza();
    private Pizza pizza3 = new Pizza();

    /**
     * Construct a pizza order and initialized number of pizza in the order to be 1
     */
    public PizzaOrder(){
        numPizzas = 1;
    }

    /**
     * Construct a pizza order and initialized the number of pizzas in the order to the given value
     * @param numPizzas number of pizzas in the order (1,2,or 3)
     */
    public PizzaOrder(int numPizzas){
        setNumPizzas(numPizzas);
    }

    /**
     * Set the number of pizzas in the order to the given value
     * @param numPizzas number of pizzas in the order
     */
    public void setNumPizzas(int numPizzas){
        if(numPizzas >= 1 && numPizzas <= 3){
            this.numPizzas = numPizzas;
        }
        else{
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    /**
     * Get the number of pizzas in the order
     * @return the number of pizzas in the order
     */
    public int getNumPizzas(){
        return numPizzas;
    }

    /**
     * Set the first pizza in the order to the given object
     * @param pizza1 the pizza information we want our 1st pizza to be
     */
    public void setPizza1(Pizza pizza1){
        this.pizza1 = pizza1;
    }

    /**
     * Get the information of the first pizza in our order
     * @return the information of the 1st pizza in the order
     */
    public Pizza getPizza1(){
        return pizza1;
    }

    /**
     * Get the information of the second pizza in our order
     * @return the information of the second pizza in the order
     */
    public Pizza getPizza2(){
        return pizza2;
    }

    /**
     * Get the information of the third pizza in the order
     * @return the information of the third pizza in the order
     */
    public Pizza getPizza3(){
        return pizza3;
    }

    /**
     * Set the second pizza in the order to the given object
     * @param pizza2 the pizza information we want our 2nd pizza to be
     */
    public void setPizza2(Pizza pizza2){
        this.pizza2 = pizza2;
    }

    /**
     * Set the third pizza in the order to the given object
     * @param pizza3 the pizza information we want our 3rd pizza to be
     */
    public void setPizza3(Pizza pizza3){
        this.pizza3 = pizza3;
    }

    /**
     * Calculate the total cost of all the pizzas in the order: total cost = cost of pizza1 + cost of pizza2 + cost of pizza3
     * @return the total cost of all pizzas in the order
     */
    public double calcTotal(){
        if(this.numPizzas == 1){
            return this.pizza1.calcCost();
        }
        else if(numPizzas == 2){
            return this.pizza1.calcCost() + this.pizza2.calcCost();
        }
        else if(numPizzas == 3){
            return this.pizza1.calcCost() + this.pizza2.calcCost() + this.pizza3.calcCost();
        }
        else{
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }
    }

    /**
     * Main method which is used to do some manual test of the class.
     * @param args
     */
    public static void main(String[] args){
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2,2,0);
        Pizza pizza3 = new Pizza();
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        double total = order.calcTotal();
        System.out.println("There are " + order.numPizzas + " pizza(s) in the order\n");
        System.out.println("The 1st pizza:");
        System.out.println(pizza1.getDescription());
        if(order.numPizzas == 2){
            System.out.println("The 2nd pizza:");
            System.out.println(pizza2.getDescription());
        }
        if(order.numPizzas == 3){
            System.out.println("The 3rd pizza:");
            System.out.println(pizza3.getDescription());
        }
        System.out.printf("Total cost of the order: %.2f\n", total);
    }
}
