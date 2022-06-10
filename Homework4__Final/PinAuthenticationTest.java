import static org.junit.jupiter.api.Assertions.*;

class PinAuthenticationTest {
    private static final int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] randomizedValues = new int[10];
    private static int[] pin = new int[5];
    private static int[] privateKey = new int[5];
    private static int[] encryptedInput = new int[5];

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void randomizeValues() {
        PinAuthentication.randomizeValues();
    }

    @org.junit.jupiter.api.Test
    void userPin() {
    }

    @org.junit.jupiter.api.Test
    void userLogin() {
    }

    @org.junit.jupiter.api.Test
    void authenticate() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}