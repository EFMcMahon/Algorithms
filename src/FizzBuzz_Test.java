import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_Test {
    @Test
    public void fizzBuzz_test1() {
        assertEquals(Challenges.fizzBuzz(3), "Fizz");
    }
    @Test
    public void fizzBuzz_test2() {
        assertEquals(Challenges.fizzBuzz(5), "Buzz");
    }
    @Test
    public void fizzBuzz_test3() {
        assertEquals(Challenges.fizzBuzz(15), "FizzBuzz");
    }
    @Test
    public void fizzBuzz_test4() {
        assertEquals(Challenges.fizzBuzz(10), "Buzz");
    }
    @Test
    public void fizzBuzz_test5() {
        assertEquals(Challenges.fizzBuzz(98), "98");
    }

}
