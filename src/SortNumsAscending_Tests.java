import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortNumsAscending_Tests {
    @Test
    public void sortNumsAscending_test1() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{1, 2, 10, 50, 5}), (new int[]{1, 2, 5, 10, 50}));
    }

    @Test
    public void sortNumsAscending_test2() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{80, 29, 4, -95, -24, 85}), (new int[]{-95, -24, 4, 29, 80, 85}));
    }

    @Test
    public void sortNumsAscending_test3() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{}), (new int[]{}));
    }

    @Test
    public void sortNumsAscending_test4() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{47, 51, -17, -16, 91, 47, -85, -8, -16, -27}), (new int[]{-85, -27, -17, -16, -16, -8, 47, 47, 51, 91}));
    }

    @Test
    public void sortNumsAscending_test5() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{-51, -73, 65, 69, -76, 74, -14}), (new int[]{-76, -73, -51, -14, 65, 69, 74}));
    }

    @Test
    public void sortNumsAscending_test6() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{45, 98, 35, 65, 97, 21, 33}), (new int[]{21, 33, 35, 45, 65, 97, 98}));
    }

    @Test
    public void sortNumsAscending_test7() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{-23, -69, -54, -2, -32}), (new int[]{-69, -54, -32, -23, -2}));
    }

    @Test
    public void sortNumsAscending_test8() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{-21, -9, -96}), (new int[]{-96, -21, -9}));
    }

    @Test
    public void sortNumsAscending_test9() {
        assertArrayEquals(Challenges.sortNumsAscending(new int[]{0}), (new int[]{0}));
    }
}
