import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    Pizza pizza1, pizza2,pizza3, pizza4, pizza5;

    @BeforeEach
    void setUp() {
        pizza1 = new Pizza(1,1,1,"L");
        pizza2 = new Pizza();
        pizza3 = new Pizza(2,2,2,"M");
        pizza4 = new Pizza(1,2,3,"S");
        pizza5 = new Pizza(3,4,5,"L");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setPepperoniTopping() {
        pizza1.setPepperoniTopping(3);
        assertEquals(3, pizza1.getPepperoniTopping());
        pizza2.setPepperoniTopping(0);
        assertEquals(0, pizza2.getPepperoniTopping());
    }

    @Test
    void setHamTopping() {
        pizza3.setHamTopping(2);
        assertEquals(2, pizza3.getHamTopping());
        pizza4.setHamTopping(0);
        assertEquals(0, pizza4.getHamTopping());
    }


    @Test
    void setCheeseTopping() {
        pizza3.setCheeseTopping(1);
        assertEquals(1, pizza3.getCheeseTopping());
        pizza5.setCheeseTopping(10);
        assertEquals(10, pizza5.getCheeseTopping());
    }

    @Test
    void setSize() {
        pizza3.setSize("S");
        assertEquals("S", pizza3.getSize());
        pizza5.setSize("m");
        assertEquals("m", pizza5.getSize());
    }

    @Test
    void getPepperoniTopping() {
        assertEquals(1, pizza1.getPepperoniTopping());
        assertEquals(0, pizza2.getPepperoniTopping());
    }

    @Test
    void getHamTopping() {
        assertEquals(2, pizza4.getHamTopping());
        assertEquals(4, pizza5.getHamTopping());
    }

    @Test
    void getCheeseTopping() {
        assertEquals(3, pizza4.getCheeseTopping());
        assertEquals(5, pizza5.getCheeseTopping());
    }

    @Test
    void getSize() {
        assertEquals("M", pizza3.getSize());
        assertEquals("L", pizza5.getSize());
    }

    @Test
    void calcCost() {
        assertEquals(20.0, pizza1.calcCost());
        assertEquals(24.0, pizza3.calcCost());
    }

    @Test
    short isValidAmount(int i) {
        assertEquals(true, isValidAmount(4));
        return 0;
    }

    @Test
    short isSizeValid(String m) {
        assertEquals(true, isSizeValid("M"));
        return 0;
    }

    @Test
    void sizeCost() {
        assertEquals(14.0, pizza1.sizeCost(pizza1.getSize()));
        assertEquals(10.0, pizza4.sizeCost(pizza4.getSize()));
    }

    @Test
    void getDescription() {
        assertEquals("The L pizza has 1 pepperoni topping(s) 1 ham topping(s) 1 cheese topping(s) and costs 20.0", pizza1.getDescription());
    }

}