import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTheBomb_Test {
    String[] strVector = new String[] {
            "There is a bOmB.", "Hey, did you think there is a BOMB?", "This goes boom!!!",
            "Commotion in the third, a bomb found!", "Hey, did you find it?", "Hey, did you find the BoMb?"
    };
    String[] resVector = new String[] {
            "DUCK!", "DUCK!", "Relax, there's no bomb.", "DUCK!", "Relax, there's no bomb.", "DUCK!"
    };

    @Test
    public void duckTheBomb_test01() {
        assertEquals(resVector[0], Challenges.duckTheBomb(strVector[0]));
    }

    @Test
    public void duckTheBomb_test02() {
        assertEquals(resVector[1], Challenges.duckTheBomb(strVector[1]));
    }

    @Test
    public void duckTheBomb_test03() {
        assertEquals(resVector[2], Challenges.duckTheBomb(strVector[2]));
    }

    @Test
    public void duckTheBomb_test04() {
        assertEquals(resVector[3], Challenges.duckTheBomb(strVector[3]));
    }

    @Test
    public void duckTheBomb_test05() {
        assertEquals(resVector[4], Challenges.duckTheBomb(strVector[4]));
    }

    @Test
    public void duckTheBomb_test06() {
        assertEquals(resVector[5], Challenges.duckTheBomb(strVector[5]));
    }


}
