/**
 * Allows up to 3 pizzas to be saved in an order.
 * The pizza objects are created following the Pizza class
 */
public class PizzaOrder {

    private int numPizzas;
    private Pizza pizza1 = null;
    private Pizza pizza2 = null;
    private Pizza pizza3 = null;

    /**
     * Construct a pizza order and initialized number of pizza in the order to be 1
     */
    public PizzaOrder() {numPizzas = 1;}

    /**
     * Construct a pizza order and initialized the number of pizzas in the order to the given value
     * @param numPizzas number of pizzas in the order (1,2,or 3)
     */
    public PizzaOrder(int numPizzas) {setNumPizzas(numPizzas);}

    /**
     * this is a copy constructor
     */
    public PizzaOrder(PizzaOrder otherOrder)
    {
        this.numPizzas = otherOrder.numPizzas;
        this.pizza1 = null;
        this.pizza2 = null;
        this.pizza3 = null;
        if(this.numPizzas > 0)
        {
            this.pizza1 = new Pizza(otherOrder.pizza1);
        }
        if(this.numPizzas > 1)
        {
            this.pizza2 = new Pizza(otherOrder.pizza2);
        }
        if(this.numPizzas > 2)
        {
            this.pizza3 = new Pizza(otherOrder.pizza3);
        }
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
    public int getNumPizzas() {return numPizzas;}

    /**
     * Set the first pizza in the order to the given object
     * @param pizza1 the pizza information we want our 1st pizza to be
     */
    public void setPizza1(Pizza pizza1){
        if(numPizzas > 0)
        {
            this.pizza1 = pizza1;
        }
        else
        {
            System.out.println("Set pizza fail: Invalid number of pizzas in the order!");
        }
    }

    /**
     * Get the information of the first pizza in our order
     * @return the information of the 1st pizza in the order
     */
    public Pizza getPizza1(){
        if(numPizzas > 0)
        {
            return pizza1;
        }
        else
        {
            return null;
        }
    }

    /**
     * Get the information of the second pizza in our order
     * @return the information of the second pizza in the order
     */
    public Pizza getPizza2(){
        if(numPizzas > 1)
        {
            return pizza2;
        }
        else
        {
            return null;
        }
    }

    /**
     * Get the information of the third pizza in the order
     * @return the information of the third pizza in the order
     */
    public Pizza getPizza3(){
        if(numPizzas > 2)
        {
            return pizza3;
        }
        else
        {
            return null;
        }
    }

    /**
     * Set the second pizza in the order to the given object
     * @param pizza2 the pizza information we want our 2nd pizza to be
     */
    public void setPizza2(Pizza pizza2){
        if(numPizzas > 1)
        {
            this.pizza2 = pizza2;
        }
        else
        {
            System.out.println("Set pizza fail: Invalid number of pizzas in the order!");
        }      
    }

    /**
     * Set the third pizza in the order to the given object
     * @param pizza3 the pizza information we want our 3rd pizza to be
     */
    public void setPizza3(Pizza pizza3){
        if(numPizzas > 2)
        {
            this.pizza3 = pizza3;
        }
        else
        {
            System.out.println("Set pizza fail: Invalid number of pizzas in the order!");
        } 
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
       Pizza pizza2 = new Pizza("medium", 2, 2, 0);
       PizzaOrder order1 = new PizzaOrder();
       order1.setNumPizzas(2);
       order1.setPizza1(pizza1);
       order1.setPizza2(pizza2);
       double total1 = order1.calcTotal();
       PizzaOrder order2 = new PizzaOrder(order1);
       order2.getPizza1().setCheese(3);
       double total2 = order2.calcTotal();
       double origTotal = order1.calcTotal();
       System.out.println(total1);
       System.out.println(total2);
       System.out.println(origTotal);
    }
}

