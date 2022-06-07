import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    private PizzaOrder order1;
    private PizzaOrder order2;
    private PizzaOrder order3;

    @BeforeEach
    public void setUp() {
        order1 = new PizzaOrder();
        order2 = new PizzaOrder(2);
        order3 = new PizzaOrder(3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void setNumPizzas() {
        order1.setNumPizzas(2);
        order2.setNumPizzas(1);
        order3.setNumPizzas(3);
        assertEquals(2, order1.getNumPizzas());
        assertEquals(1, order2.getNumPizzas());
        assertEquals(3, order3.getNumPizzas());
    }

    @Test
    public void getNumPizzas() {
        assertEquals(1, order1.getNumPizzas());
        assertEquals(2, order2.getNumPizzas());
        assertEquals(3, order3.getNumPizzas());
    }

    @Test
    public void setPizza1() {
        order1.setPizza1(new Pizza("large", 2,3,4));
        assertEquals("large", order1.getPizza1().getSize());
        assertEquals(2, order1.getPizza1().getCheese());
        assertEquals(3, order1.getPizza1().getPepperoni());
        assertEquals(4, order1.getPizza1().getHam());
        order2.setPizza1(new Pizza("medium", 1,3,5));
        assertEquals("medium", order2.getPizza1().getSize());
        assertEquals(1, order2.getPizza1().getCheese());
        assertEquals(3, order2.getPizza1().getPepperoni());
        assertEquals(5, order2.getPizza1().getHam());
    }

    @Test
    public void setPizza2() {
        order2.setPizza2(new Pizza("large", 2,3,4));
        assertEquals("large", order2.getPizza2().getSize());
        assertEquals(2, order2.getPizza2().getCheese());
        assertEquals(3, order2.getPizza2().getPepperoni());
        assertEquals(4, order2.getPizza2().getHam());
        order3.setPizza2(new Pizza("medium", 1,3,5));
        assertEquals("medium", order3.getPizza2().getSize());
        assertEquals(1, order3.getPizza2().getCheese());
        assertEquals(3, order3.getPizza2().getPepperoni());
        assertEquals(5, order3.getPizza2().getHam());
    }

    @Test
    public void setPizza3() {
        order3.setPizza3(new Pizza("medium", 1,3,5));
        assertEquals("medium", order3.getPizza3().getSize());
        assertEquals(1, order3.getPizza3().getCheese());
        assertEquals(3, order3.getPizza3().getPepperoni());
        assertEquals(5, order3.getPizza3().getHam());
    }

    @Test
    public void calcTotal() {
        order1.setPizza1(new Pizza("medium", 1,3,5));
        order2.setPizza1(new Pizza("medium", 1,3,5));
        order2.setPizza2(new Pizza("large", 2,4,6));
        assertEquals(30, order1.calcTotal());
        assertEquals(68, order2.calcTotal());
    }
}