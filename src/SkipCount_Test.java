import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkipCount_Test {
    @Test
    public void skipCount_test1(){
        assertEquals(Challenges.skipCount(4, 13, 3), "4.. 7.. 10.. 13");
    }

    @Test
    public void skipCount_test2(){
        assertEquals(Challenges.skipCount(0, 21, 7), "0.. 7.. 14.. 21");
    }

    @Test
    public void skipCount_test3(){
        assertEquals(Challenges.skipCount(1, 10, 5), "1.. 6");
    }

    @Test
    public void skipCount_test4(){
        assertEquals(Challenges.skipCount(10, 100, 5), "10.. 15.. 20.. 25.. 30.. 35.. 40.. 45.. 50.. 55.. 60.. 65.. 70.. 75.. 80.. 85.. 90.. 95.. 100");
    }

    @Test
    public void skipCount_test5(){
        assertEquals(Challenges.skipCount(10, 5, 2), "Try again with better numbers!");
    }

}
