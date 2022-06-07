/**
 * Creates objects with number of pizzas in a single order. Up to 3 Pizzas per order
 */
public class PizzaOrder {
    int numPizzas=0;
    Pizza orderPizza1;
    Pizza orderPizza2;
    Pizza orderPizza3;
    Pizza nullPizza = null;

    /**
     * Constructor with one parameter number of pizzas
     * @param numPizzas = positive int less than equal to three which sets the amount of pizzas for the order.
     */
    PizzaOrder(int numPizzas) {
        setNumPizzas(numPizzas);
    }

    /**
     * Constructor for Order
     */
    PizzaOrder(){
        setNumPizzas(numPizzas);
    }

    /**
     * Method to test whether input for number of pizzas is a valid positive integer that is less than 3.
     * @param numPizzas = number of pizzas integer.
     */
    public void setNumPizzas(int numPizzas) {
        if (numPizzas >0 && numPizzas<= 3) {
            if (numPizzas == 1) {
                this.numPizzas = numPizzas;
                this.orderPizza1 = new Pizza();
            } else if (numPizzas == 2) {
                this.numPizzas = numPizzas;
                this.orderPizza1 = new Pizza();
                this.orderPizza2 = new Pizza();
            } else if (numPizzas == 3) {
                this.numPizzas = numPizzas;
                this.orderPizza1 = new Pizza();
                this.orderPizza2 = new Pizza();
                this.orderPizza3 = new Pizza();
            }
        } else {
            this.numPizzas = numPizzas;
            System.out.println("invalid amount. input positive int of 3 or less.");
        }

    }

    /**
     * method to set the first pizza within the order object.
     * @param pizza = pizza object that you wish to add to order object for first pizza
     */
    public void setPizza1(Pizza pizza){
        orderPizza1 = pizza;
    }
    /**
     * method to set the second pizza within the order object.
     * @param pizza = pizza object that you wish to add to order object for second pizza
     */
    public void setPizza2(Pizza pizza){
        orderPizza2 = pizza;
    }
    /**
     * method to set the third pizza within the order object.
     * @param pizza = pizza object that you wish to add to order object for third pizza
     */
    public void setPizza3(Pizza pizza){
        orderPizza3 = pizza;
    }

    /**
     * method to calculate total for the order
     * @return = double for the total cost of all the pizzas in the order.
     */
    public double calcTotal() {
        if (numPizzas == 1) {
            return orderPizza1.calcCost();
        } else if (numPizzas == 2) {
            return (orderPizza1.calcCost() + orderPizza2.calcCost());
        } else if (numPizzas == 3) {
            return (orderPizza1.calcCost() + orderPizza2.calcCost() + orderPizza3.calcCost());
        } else {
            System.out.println("Invalid num of pizzas error");
            return 0;
        }
    }
    // #1 Assignment 4 Below
    public int getNumPizzas(){
        return this.numPizzas;
    }

    public Pizza getPizza1() {
        if(numPizzas>0)
            return this.orderPizza1;
        else
            return nullPizza;

    }
    public Pizza getPizza2() {
        if (numPizzas >= 2)
            return this.orderPizza2;
        else
            return nullPizza;
    }
    public Pizza getPizza3() {
        if (numPizzas == 3)
            return this.orderPizza3;
        else
            return nullPizza;
    }
//




    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(0, 1,1, "L");
        Pizza pizza2 = new Pizza(2, 0,2,"M");
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        System.out.println("order 1, pizza 1="+ pizza1.calcCost());
        System.out.println("order1, pizza 2="+ pizza2.calcCost());
        double total = order.calcTotal();
        System.out.println("The total should be 22: " + total);

        //second order below

        PizzaOrder order2 = new PizzaOrder(3);
        Pizza pizza3 = new Pizza(1,2,3,"l");
        Pizza pizza4 = new Pizza(2,3,4,"M");
        Pizza pizza5 = new Pizza(1,1,1,"S");
        order2.setPizza1(pizza4);
        order2.setPizza2(pizza3);
        order2.setPizza3(pizza5);
        System.out.println("Order 2, pizza 1= "+ pizza3.calcCost());
        System.out.println("Order 2, pizza 2= "+ pizza4.calcCost());
        System.out.println("Order 3, Pizza 3= "+ pizza5.calcCost());
        double total2 = order2.calcTotal();
        System.out.println("The total should be 72: " + total2);
    }
}


