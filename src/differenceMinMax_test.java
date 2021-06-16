import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class differenceMinMax_test {
    @Test
    public void diffMinMax_test1(){
        assertEquals(Challenges.differenceMinMax(new int[]{3, 0, 9, 99, -2}),101 );
    }
    @Test
    public void diffMinMax_test2(){
        assertEquals(Challenges.differenceMinMax(new int[]{ 200, 89, -23, 40, 77, 43}),223 );
    }

    @Test
    public void diffMinMax_test3(){
        assertEquals(Challenges.differenceMinMax(new int[]{98, 777, 45, 22 }),755);
    }

    @Test
    public void diffMinMax_test4(){
        assertEquals(Challenges.differenceMinMax(new int[]{-200, -40, -23, -66, -77 }),177);
    }

    @Test
    public void diffMinMax_test5(){
        assertEquals(Challenges.differenceMinMax(new int[]{10, 4, 1, 4, -10, -50, 32, 21}), 82);
    }

    @Test
    public void diffMinMax_test6(){
        assertEquals(Challenges.differenceMinMax(new int[]{44, 32, 86, 19}), 67);
    }
}
