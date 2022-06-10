/**
 *Create an order of pizzas and set the number of pizzas in the order.
 */
public class PizzaOrder2
{
    private int numPizzas=0;
    private Pizza[] pizzaOrderArray;


    /**
     * no argument constructor for PizzaOrder2
     */
    public PizzaOrder2()
    {
        setNumPizzas(1);
    }


    /**
     * Constructor with one parameter: number of pizzas
     * @param numPizzas = number of pizzas in the order
     */
    public PizzaOrder2(int numPizzas) {setNumPizzas(numPizzas);}


    /**
     * Method to set the number of pizzas in the order (will test if the parameter greater than 0)
     * @param numPizzas = number of pizzas in the order
     */
    public void setNumPizzas(int numPizzas)
    {
        if(numPizzas > 0 && numPizzas != this.numPizzas)
        {
            Pizza[] temp = new Pizza[numPizzas];
            if(this.numPizzas > numPizzas)
            {
                for(int i = 0; i < numPizzas; i++)
                {
                    temp[i] = this.pizzaOrderArray[i];
                }
            }
            else
            {
               for(int j = 0; j < this.numPizzas; j++)
               {
                   temp[j] = this.pizzaOrderArray[j];
               }
               for(int k = this.numPizzas; k < numPizzas; k++)
               {
                   temp[k] = new Pizza();
               }
            }
            this.numPizzas = numPizzas;
            this.pizzaOrderArray = temp;
        }
        else
        {
             System.out.println("Failed to set number of pizzas: invalid order size!");
        }
    }

    /**
     *
     * @return
     */
    public int getNumPizzas() {return this.numPizzas;}

    /**
     *
     * @param pizza
     * @param index
     */
    public void setPizza(Pizza pizza, int index)
    {
        if(index>=1 && index<=numPizzas && pizza!=null)
        {
            this.pizzaOrderArray[index-1] = pizza;
        }
        else
        {
            System.out.println("Set pizza fail: either index is valid or the pizza is empty");
        }
    }

    /**
     *
     * @param index
     * @return
     */
    public Pizza getPizza(int index)
    {
        if(index>=1 && index<=this.numPizzas)
        {
            return new Pizza(this.pizzaOrderArray[index-1]);
        }
        else
        {
            System.out.println("Get pizza fail: invalid index");
            return null;
        }
    }

    /**
     * Method to calculate total order cost
     * @return returns double of total cost of order.
     */
    public double calcTotal()
    {
        double result = 0;
        for(int i = 0; i < numPizzas; i++)
        {
            if(pizzaOrderArray[i]!=null)
            {
                result += pizzaOrderArray[i].calcCost();
            }
        }
        return result;
    }

    /**
     * Main to test methods
     * @param args
     */
    public static void main(String[] args)
    {
        PizzaOrder2 order2 = new PizzaOrder2(2);
        System.out.println(order2.getNumPizzas());
        System.out.println(order2.calcTotal());
        System.out.println(order2.getPizza(2).getPepperoniTopping());
    }
}