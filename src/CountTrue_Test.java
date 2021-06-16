import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTrue_Test {
    @Test
    public void countTrue_1() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, false, true, false }), (2));
    }

    @Test
    public void countTrue_test2() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { false, false, false, false }), (0));
    }

    @Test
    public void countTrue_test3() {
        assertEquals(Challenges.countTrueFalse(new boolean[] {}), (0));
    }

    @Test
    public void countTrue_test4() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { false, false, true, true, false, false, false, true, true, true,
                true, false, true, true, false }), (8));
    }

    @Test
    public void countTrue_test5() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, true, true, false, false, false, false, false }),
                (3));
    }

    @Test
    public void countTrue_test6() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { false, true, true, false, true, true, false, true, false, true,
                false, true, false, true, false }), (8));
    }

    @Test
    public void countTrue_test7() {
        assertEquals(
                Challenges.countTrueFalse(new boolean[] { true, false, true, true, true, false, true, true, false, false }),
                (6));
    }

    @Test
    public void countTrue_test8() {
        assertEquals(
                Challenges.countTrueFalse(
                        new boolean[] { false, false, false, false, true, false, true, false, true, false, false }),
                (3));
    }

    @Test
    public void countTrue_test9() {
        assertEquals(
                Challenges.countTrueFalse(
                        new boolean[] { true, false, false, false, true, false, false, true, false, false, false }),
                (3));
    }

    @Test
    public void countTrue_test10() {
        assertEquals(
                Challenges.countTrueFalse(new boolean[] { true, true, false, true, false, false, false, false, true, false }),
                (4));
    }

    @Test
    public void countTrue_test11() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, true, true, false, true, true, true, true, false,
                true, false, true, false }), (9));
    }

    @Test
    public void countTrue_test12() {
        assertEquals(Challenges.countTrueFalse(new boolean[] { true, false, true, true, true, true, false, true, true, false,
                true, false, false, false, false }), (8));
    }

    @Test
    public void countTrue_test13() {
        assertEquals(
                Challenges.countTrueFalse(
                        new boolean[] { true, true, false, false, false, false, true, false, true, true, false, true }),
                (6));
    }

}
