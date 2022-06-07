/**
 * Allows up to 3 pizzas to be saved in an order.
 * The pizza objects are created following the Pizza class
 */
public class PizzaOrder {

    private int numPizzas;
    private Pizza[] pizzaArray;

   /**
     * Set the number of pizzas in the order to the given value
     * @param numPizzas number of pizzas in the order
     */
    public Pizza[] setNumPizzas(int numPizzas){
        if(numPizzas >= 1 && numPizzas != this.numPizzas){
            Pizza[] temp = new Pizza[numPizzas];
            if(this.numPizzas > numPizzas)
            {
                for(int i = 0; i < numPizzas; i++)
                {
                    temp[i] = this.pizzaArray[i];
                }
            }
            else
            {
                for(int j = 0; j < this.numPizzas; j++)
                {
                    temp[j] = this.pizzaArray[j];
                }
                for(int k = this.numPizzas; k < numPizzas; k++)
                {
                    temp[k] = null;
                }
            }
            this.numPizzas = numPizzas;
            return temp;
        }
        else{
            System.out.println("Fatal Error");
            return this.pizzaArray;
        }
        
    }

    /**
     * Construct a pizza order and initialized number of pizza in the order to be 1
     */
    public PizzaOrder() {setNumPizzas(1);}
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
        this.pizzaArray = setNumPizzas(otherOrder.numPizzas);
        this.numPizzas = otherOrder.numPizzas;
        for(int i = 0; i < numPizzas; i++)
        {
            this.pizzaArray[i] = new Pizza(otherOrder.pizzaArray[i]);
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
    public void setPizza(Pizza pizza, int i){
        if(i <= numPizzas && i >= 1)
        {
            this.pizzaArray[i-1] = pizza;
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
        double result = 0;
        for(int i = 0; i < numPizzas; i++)
        {
            if(pizzaArray[i] != null)
            {
                result += pizzaArray[i].calcCost();
            }
        }
        return result;
    }

    /**
     * Main method which is used to do some manual test of the class.
     * @param args
     */
    public static void main(String[] args){   
       
    }
}
