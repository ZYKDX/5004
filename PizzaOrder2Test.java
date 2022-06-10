import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrder2Test {
    PizzaOrder2 pizzaOrder1, pizzaOrder2, pizzaOrder3;

    @BeforeEach
    void setUp() {
       pizzaOrder1 = new PizzaOrder2();
       pizzaOrder2 = new PizzaOrder2();
       pizzaOrder3 = new PizzaOrder2();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setNumPizzas() {
        pizzaOrder1.setNumPizzas(1);
        pizzaOrder2.setNumPizzas(2);
        pizzaOrder3.setNumPizzas(3);
        assertEquals(1,pizzaOrder1.getNumPizzas());
        assertEquals(2,pizzaOrder2.getNumPizzas());
        assertEquals(3, pizzaOrder3.getNumPizzas());
    }

    @Test
    void getNumPizzas() {
        pizzaOrder1.setNumPizzas(1);
        pizzaOrder2.setNumPizzas(2);
        pizzaOrder3.setNumPizzas(3);
        assertEquals(1,pizzaOrder1.getNumPizzas());
        assertEquals(2,pizzaOrder2.getNumPizzas());
        assertEquals(3, pizzaOrder3.getNumPizzas());
    }

    @Test
    void setPizza() {
        Pizza pizza1 = new Pizza("small",1,1,1);
        Pizza pizza2 = new Pizza("small",2,2,2);
        pizzaOrder1.setNumPizzas(1);
        pizzaOrder2.setNumPizzas(2);
        pizzaOrder3.setNumPizzas(3);
        assertEquals(1,pizzaOrder1.getNumPizzas());
        assertEquals(2,pizzaOrder2.getNumPizzas());
        assertEquals(3, pizzaOrder3.getNumPizzas());
    }

    @Test
    void getPizza() {
        Pizza pizza1 = new Pizza("small",1,1,1);
        Pizza pizza2 = new Pizza("medium",2,2,2);
        Pizza pizza3 = new Pizza("large",3,3,3);
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder1.setPizza(pizza1,1);
        pizzaOrder1.setPizza(pizza2,2);
        pizzaOrder1.setPizza(pizza3,3);
        assertEquals("small",pizzaOrder1.getPizza(1).getSize());
        assertEquals(1, pizzaOrder1.getPizza(1).getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getPizza(1).getHamTopping());
        assertEquals(1, pizzaOrder1.getPizza(1).getCheeseTopping());
        assertEquals("medium",pizzaOrder1.getPizza(2).getSize());
        assertEquals(2, pizzaOrder1.getPizza(2).getCheeseTopping());
        assertEquals(2, pizzaOrder1.getPizza(2).getHamTopping());
        assertEquals(2, pizzaOrder1.getPizza(2).getPepperoniTopping());
        assertEquals("large",pizzaOrder1.getPizza(3).getSize());
        assertEquals(3, pizzaOrder1.getPizza(3).getPepperoniTopping());
        assertEquals(3, pizzaOrder1.getPizza(3).getHamTopping());
        assertEquals(3, pizzaOrder1.getPizza(3).getCheeseTopping());
    }

    @Test
    void calcTotal() {
        Pizza pizza1 = new Pizza("small",1,1,1);
        Pizza pizza2 = new Pizza("medium",2,2,2);
        Pizza pizza3 = new Pizza("large",3,3,3);
        Pizza pizza4 = new Pizza("small",2,2,2);
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder1.setPizza(pizza1,1);
        pizzaOrder1.setPizza(pizza2,2);
        pizzaOrder1.setPizza(pizza3,3);
        pizzaOrder2.setPizza(pizza1,1);
        pizzaOrder2.setPizza(pizza2,2);
        pizzaOrder2.setPizza(pizza4,3);

        assertEquals(72,pizzaOrder1.calcTotal());
        assertEquals(62,pizzaOrder2.calcTotal());

    }

    @Test
    void main() {
    }
}