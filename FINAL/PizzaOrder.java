/**
 * Create an order of pizzas, allowing up to 3 pizzas in the order
 */
public class PizzaOrder
{
    private int numPizzas = 0;
    private Pizza orderPizza1 = null, orderPizza2 = null, orderPizza3 = null;


    /**
     *
     */
    public PizzaOrder()
    {setNumPizzas(0);}


    /**
     * Constructor with one parameter: number of pizzas
     * @param numPizzas = positive int 0, 1, 2, or 3 which sets the amount of pizzas for the order
     */
    public PizzaOrder(int numPizzas)
    {setNumPizzas(numPizzas);}


    /**
     * Method to set the number of pizzas in the order (will test if the parameter is valid: 0, 1, 2, or 3 are valid values)
     * @param numPizzas = number of pizzas integer
     */
    public void setNumPizzas(int numPizzas)
    {
        if(numPizzas == 0)
        {
            this.numPizzas = 0;
            orderPizza1 = null;
            orderPizza2 = null;
            orderPizza3 = null;
        }
        else if(numPizzas == 1)
        {
            this.numPizzas = 1;
            orderPizza1 = new Pizza();
            orderPizza2 = null;
            orderPizza3 = null;
        }
        else if(numPizzas == 2)
        {
            this.numPizzas = 2;
            orderPizza1 = new Pizza();
            orderPizza2 = new Pizza();
            orderPizza3 = null;
        }
        else if(numPizzas == 3)
        {
            this.numPizzas = 3;
            orderPizza1 = new Pizza();
            orderPizza2 = new Pizza();
            orderPizza3 = new Pizza();
        }
        else
        {
            System.out.println("Invalid amount, please input non-negative int less than 4");
        }
    }


    /**
     * Get the number of pizzas in the order
     * @return = the number of pizzas in the order
     */
    public int getNumPizzas() {return this.numPizzas;}

    /**
     *
     * @return
     */
    public Pizza getOrderPizza1()
    {
        if(numPizzas > 0) {return new Pizza(this.orderPizza1);}
        else {return null;}
    }
    public void setPizza1(Pizza pizza)
    {
        if(numPizzas > 0) {this.orderPizza1 = new Pizza(pizza);}
        else {System.out.println("Cannot set pizza1: incorrect number of pizzas in the order");}
    }

    /**
     *
     * @return
     */
    public Pizza getOrderPizza2()
    {
        if(numPizzas > 1) {return new Pizza(this.orderPizza2);}
        else {return null;}
    }
    public void setPizza2(Pizza pizza)
    {
        if(numPizzas > 1) {this.orderPizza2 = new Pizza(pizza);}
        else {System.out.println("Cannot set pizza2: incorrect number of pizzas in the order");}
    }

    /**
     *
     * @return
     */
    public Pizza getOrderPizza3()
    {
        if(numPizzas > 2) {return new Pizza(this.orderPizza3);}
        else {return null;}
    }
    public void setPizza3(Pizza pizza)
    {
        if(numPizzas > 2) {this.orderPizza3 = new Pizza(pizza);}
        else {System.out.println("Cannot set pizza3: incorrect number of pizzas in the order");}
    }

    /**
     * Method to calculate total price for the order
     * @return = double for the total cost of all the pizzas in the order
     */
    public double calcTotal()
    {
        if(numPizzas == 0)
        {return 0.0;}
        else if(numPizzas == 1)
        {return orderPizza1.calcCost();}
        else if(numPizzas == 2)
        {return orderPizza1.calcCost() + orderPizza2.calcCost();}
        else if(numPizzas == 3)
        {return orderPizza1.calcCost() + orderPizza2.calcCost() + orderPizza3.calcCost();}
        else
        {
            System.out.println("Invalid num of pizzas error");
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);
        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(2);
        order1.setPizza1(pizza1);
        order1.setPizza2(pizza2);
        System.out.println("order1, pizza1 = " + pizza1.getDescription());
        System.out.println("order1, pizza2 = " + pizza2.getDescription());
        double total = order1.calcTotal();
        System.out.println("Expected total: 38. Actual total: " + total);
        //second order below
        PizzaOrder order2 = new PizzaOrder(3);
        Pizza pizza3 = new Pizza("large", 1,2,3);
        Pizza pizza4 = new Pizza("medium", 2,3,4);
        Pizza pizza5 = new Pizza("small", 1,1,1);
        order2.setPizza1(pizza3);
        order2.setPizza2(pizza4);
        order2.setPizza3(pizza5);
        System.out.println("order2, pizza1 = " + pizza3.getDescription());
        System.out.println("order2, pizza2 = " + pizza4.getDescription());
        System.out.println("order2, pizza3 = " + pizza5.getDescription());
        double total2 = order2.calcTotal();
        System.out.println("Expected total: 72. Actual total: " + total2);
    }


}