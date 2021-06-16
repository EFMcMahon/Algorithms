import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class secondLargest_Test {
    @Test
    public void secondLargestNumber_test01() {
        assertEquals(40, Challenges.secondLargestNumber(new int[] {10,40,30,20,50}));
    }

    @Test
    public void secondLargestNumber_test02() {
        assertEquals(105, Challenges.secondLargestNumber(new int[] {25,143,89,13,105}));
    }

    @Test
    public void secondLargestNumber_test03() {
        assertEquals(23, Challenges.secondLargestNumber(new int[] {54,23,11,17,10}));
    }

    @Test
    public void secondLargestNumber_test04() {
        assertEquals(417, Challenges.secondLargestNumber(new int[] {513,211,131,417,11}));
    }

    @Test
    public void secondLargestNumber_test05() {
        assertEquals(65, Challenges.secondLargestNumber(new int[] {63,44,11,22,33,66,65}));
    }

    @Test
    public void secondLargestNumber_test06() {
        assertEquals(-17, Challenges.secondLargestNumber(new int[] {-24,-29,-92,-11,-17}));
    }
}
