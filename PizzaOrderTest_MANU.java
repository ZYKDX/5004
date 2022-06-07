import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {
    PizzaOrder order1, order2, order3, order4, order5;
    @BeforeEach
    void setUp() {
        order1 = new PizzaOrder();
        order2 = new PizzaOrder();
        order3 = new PizzaOrder();
        order4 = new PizzaOrder();
        order5 = new PizzaOrder();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setNumPizzas() {
        order1.setNumPizzas(3);
        assertEquals(3, order1.numPizzas);
        order2.setNumPizzas(2);
        assertEquals(2, order2.numPizzas);
        order3.setNumPizzas(1);
        assertEquals(1,order3.numPizzas);
    }


    @Test
    void calcTotal() {
        order1.setNumPizzas(3);
        Pizza pizza1 = new Pizza(1,1,1,"M");
        Pizza pizza3 = new Pizza(2,2,2,"L");
        Pizza pizza2 = new Pizza(3,3,3,"S");
        order1.setPizza1(pizza1);
        order1.setPizza2(pizza2);
        order1.setPizza3(pizza3);
        assertEquals(72.0, order1.calcTotal());
    }

}