
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {
    PizzaOrder pizzaOrder1, pizzaOrder2,pizzaOrder3, pizzaOrder4, pizzaOrder5;
    Pizza pizza1, pizza2, pizza3, pizza4;

    @BeforeEach
    void setUp() {
        pizzaOrder1 = new PizzaOrder();
        pizzaOrder2 = new PizzaOrder();
        pizzaOrder3 = new PizzaOrder();
        pizzaOrder4 = new PizzaOrder();
        pizzaOrder5 = new PizzaOrder();
        pizza1 = new Pizza("small",1,1,1);
        pizza2 = new Pizza("medium",2,2,2);
        pizza3 = new Pizza("large",3,3,3);
        pizza4 = new Pizza("small",1,2,3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setNumPizzas() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(2);
        pizzaOrder3.setNumPizzas(4);
        pizzaOrder4.setNumPizzas(-1);
        pizzaOrder5.setNumPizzas(2);
        assertEquals(3,pizzaOrder1.getNumPizzas());
        assertEquals(2,pizzaOrder2.getNumPizzas());
        assertEquals(0,pizzaOrder3.getNumPizzas());
        assertEquals(0,pizzaOrder4.getNumPizzas());
        assertEquals(2,pizzaOrder5.getNumPizzas());

    }

    @Test
    void getNumPizzas() {
        pizzaOrder1.setNumPizzas(-1);
        pizzaOrder2.setNumPizzas(1);
        pizzaOrder3.setNumPizzas(2);
        pizzaOrder4.setNumPizzas(-3);
        pizzaOrder5.setNumPizzas(2);
        assertEquals(0,pizzaOrder1.getNumPizzas());
        assertEquals(1,pizzaOrder2.getNumPizzas());
        assertEquals(2,pizzaOrder3.getNumPizzas());
        assertEquals(0,pizzaOrder4.getNumPizzas());
        assertEquals(2,pizzaOrder5.getNumPizzas());
    }

    @Test
    void getOrderPizza1() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder3.setNumPizzas(3);
        pizzaOrder1.setPizza1(pizza1);
        pizzaOrder2.setPizza1(pizza2);
        pizzaOrder3.setPizza1(pizza3);
        assertEquals("small",pizzaOrder1.getOrderPizza1().getSize());
        assertEquals(1, pizzaOrder1.getOrderPizza1().getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza1().getHamTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza1().getCheeseTopping());
        assertEquals("medium",pizzaOrder2.getOrderPizza1().getSize());
        assertEquals(2, pizzaOrder2.getOrderPizza1().getCheeseTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza1().getHamTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza1().getPepperoniTopping());
        assertEquals("large",pizzaOrder3.getOrderPizza1().getSize());
        assertEquals(3, pizzaOrder3.getOrderPizza1().getPepperoniTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza1().getHamTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza1().getCheeseTopping());
    }

    @Test
    void setPizza1() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder3.setNumPizzas(3);
        pizzaOrder1.setPizza1(pizza1);
        pizzaOrder2.setPizza1(pizza2);
        pizzaOrder3.setPizza1(pizza3);
        assertEquals("small",pizzaOrder1.getOrderPizza1().getSize());
        assertEquals(1, pizzaOrder1.getOrderPizza1().getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza1().getHamTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza1().getCheeseTopping());
        assertEquals("medium",pizzaOrder2.getOrderPizza1().getSize());
        assertEquals(2, pizzaOrder2.getOrderPizza1().getCheeseTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza1().getHamTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza1().getPepperoniTopping());
        assertEquals("large",pizzaOrder3.getOrderPizza1().getSize());
        assertEquals(3, pizzaOrder3.getOrderPizza1().getPepperoniTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza1().getHamTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza1().getCheeseTopping());
    }

    @Test
    void getOrderPizza2() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder3.setNumPizzas(3);
        pizzaOrder1.setPizza2(pizza1);
        pizzaOrder2.setPizza2(pizza2);
        pizzaOrder3.setPizza2(pizza3);
        assertEquals("small",pizzaOrder1.getOrderPizza2().getSize());
        assertEquals(1, pizzaOrder1.getOrderPizza2().getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza2().getHamTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza2().getCheeseTopping());
        assertEquals("medium",pizzaOrder2.getOrderPizza2().getSize());
        assertEquals(2, pizzaOrder2.getOrderPizza2().getCheeseTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza2().getHamTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza2().getPepperoniTopping());
        assertEquals("large",pizzaOrder3.getOrderPizza2().getSize());
        assertEquals(3, pizzaOrder3.getOrderPizza2().getPepperoniTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza2().getHamTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza2().getCheeseTopping());
    }

    @Test
    void setPizza2() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder3.setNumPizzas(3);
        pizzaOrder1.setPizza2(pizza1);
        pizzaOrder2.setPizza2(pizza2);
        pizzaOrder3.setPizza2(pizza3);
        assertEquals("small",pizzaOrder1.getOrderPizza2().getSize());
        assertEquals(1, pizzaOrder1.getOrderPizza2().getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza2().getHamTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza2().getCheeseTopping());
        assertEquals("medium",pizzaOrder2.getOrderPizza2().getSize());
        assertEquals(2, pizzaOrder2.getOrderPizza2().getCheeseTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza2().getHamTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza2().getPepperoniTopping());
        assertEquals("large",pizzaOrder3.getOrderPizza2().getSize());
        assertEquals(3, pizzaOrder3.getOrderPizza2().getPepperoniTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza2().getHamTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza2().getCheeseTopping());
    }

    @Test
    void getOrderPizza3() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder3.setNumPizzas(3);
        pizzaOrder1.setPizza3(pizza1);
        pizzaOrder2.setPizza3(pizza2);
        pizzaOrder3.setPizza3(pizza3);
        assertEquals("small",pizzaOrder1.getOrderPizza3().getSize());
        assertEquals(1, pizzaOrder1.getOrderPizza3().getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza3().getHamTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza3().getCheeseTopping());
        assertEquals("medium",pizzaOrder2.getOrderPizza3().getSize());
        assertEquals(2, pizzaOrder2.getOrderPizza3().getCheeseTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza3().getHamTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza3().getPepperoniTopping());
        assertEquals("large",pizzaOrder3.getOrderPizza3().getSize());
        assertEquals(3, pizzaOrder3.getOrderPizza3().getPepperoniTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza3().getHamTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza3().getCheeseTopping());
    }

    @Test
    void setPizza3() {
        pizzaOrder1.setNumPizzas(3);
        pizzaOrder2.setNumPizzas(3);
        pizzaOrder3.setNumPizzas(3);
        pizzaOrder1.setPizza3(pizza1);
        pizzaOrder2.setPizza3(pizza2);
        pizzaOrder3.setPizza3(pizza3);
        assertEquals("small",pizzaOrder1.getOrderPizza3().getSize());
        assertEquals(1, pizzaOrder1.getOrderPizza3().getPepperoniTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza3().getHamTopping());
        assertEquals(1, pizzaOrder1.getOrderPizza3().getCheeseTopping());
        assertEquals("medium",pizzaOrder2.getOrderPizza3().getSize());
        assertEquals(2, pizzaOrder2.getOrderPizza3().getCheeseTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza3().getHamTopping());
        assertEquals(2, pizzaOrder2.getOrderPizza3().getPepperoniTopping());
        assertEquals("large",pizzaOrder3.getOrderPizza3().getSize());
        assertEquals(3, pizzaOrder3.getOrderPizza3().getPepperoniTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza3().getHamTopping());
        assertEquals(3, pizzaOrder3.getOrderPizza3().getCheeseTopping());
    }

    @Test
    void calcTotal() {
        pizzaOrder1.setNumPizzas(2);
        pizzaOrder1.setPizza1(pizza1);
        pizzaOrder1.setPizza2(pizza2);
        assertEquals(40,pizzaOrder1.calcTotal());

        pizzaOrder2.setNumPizzas(3);
        pizzaOrder2.setPizza1(pizza2);
        pizzaOrder2.setPizza2(pizza1);
        pizzaOrder2.setPizza3(pizza3);
        assertEquals(72,pizzaOrder2.calcTotal());

    }

    @Test
    void main() {
    }
}