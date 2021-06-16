import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reverser_Test {
    @Test
    public void reverser_test1() {
        assertEquals("DLROw OLLEh", Challenges.reverser("Hello World"));
    }

    @Test
    public void reverser_test2() {
        assertEquals("eSrEvEr", Challenges.reverser("ReVeRsE"));
    }

    @Test
    public void reverser_test3() {
        assertEquals("RELIPMOC AVAj", Challenges.reverser("Java compiler"));
    }

    @Test
    public void reverser_test4(){assertEquals("!$KC0r ENAj", Challenges.reverser("Jane R0ck$!"));}

}
