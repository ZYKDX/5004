import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        this.pizza1 = new Pizza();
        this.pizza2 = new Pizza("medium", 2,4,6);
        this.pizza3 = new Pizza("large", 3,5,7);
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void getSize() {
        assertEquals("small", pizza1.getSize());
        assertEquals("medium", pizza2.getSize());
        assertEquals("large", pizza3.getSize());
    }

    @org.junit.jupiter.api.Test
    public void getCheese() {
        assertEquals(0, pizza1.getCheese());
        assertEquals(2, pizza2.getCheese());
        assertEquals(3, pizza3.getCheese());
    }

    @org.junit.jupiter.api.Test
    public void getPepperoni() {
        assertEquals(0, pizza1.getPepperoni());
        assertEquals(4, pizza2.getPepperoni());
        assertEquals(5, pizza3.getPepperoni());
    }

    @org.junit.jupiter.api.Test
    public void getHam() {
        assertEquals(0, pizza1.getHam());
        assertEquals(6, pizza2.getHam());
        assertEquals(7, pizza3.getHam());
    }

    @org.junit.jupiter.api.Test
    public void setSize() {
        pizza1.setSize("medium");
        assertEquals("medium", pizza1.getSize());
        pizza2.setSize("large");
        assertEquals("large", pizza2.getSize());
        pizza3.setSize("small");
        assertEquals("small", pizza3.getSize());
    }

    @org.junit.jupiter.api.Test
   public void setCheese() {
        pizza1.setCheese(11);
        assertEquals(11, pizza1.getCheese());
        pizza2.setCheese(12);
        assertEquals(12, pizza2.getCheese());
        pizza3.setCheese(13);
        assertEquals(13, pizza3.getCheese());
    }

    @org.junit.jupiter.api.Test
    public void setPepperoni() {
        pizza1.setPepperoni(14);
        assertEquals(14, pizza1.getPepperoni());
        pizza2.setPepperoni(15);
        assertEquals(15, pizza2.getPepperoni());
        pizza3.setPepperoni(16);
        assertEquals(16, pizza3.getPepperoni());
    }

    @org.junit.jupiter.api.Test
    void setHam() {
        pizza1.setHam(17);
        assertEquals(17, pizza1.getHam());
        pizza2.setHam(18);
        assertEquals(18, pizza2.getHam());
        pizza3.setHam(19);
        assertEquals(19, pizza3.getHam());
    }

    @org.junit.jupiter.api.Test
    void calcCost() {
        assertEquals(10,pizza1.calcCost());
        assertEquals(36,pizza2.calcCost());
        assertEquals(44,pizza3.calcCost());
    }

}