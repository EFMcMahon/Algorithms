import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stutter_Test {
    @Test
    public void stutter_test01() {
        assertEquals("in... in... increasing?", Challenges.stutter("increasing"));
    }

    @Test
    public void stutter_test02() {
        assertEquals("ad... ad... adventures?", Challenges.stutter("adventures"));
    }

    @Test
    public void stutter_test03() {
        assertEquals("en... en... enticing?", Challenges.stutter("enticing"));
    }

    @Test
    public void stutter_test04() {
        assertEquals("un... un... unacceptable?", Challenges.stutter("unacceptable"));
    }

    @Test
    public void stutter_test05() {
        assertEquals("ac... ac... accountable?", Challenges.stutter("accountable"));
    }

    @Test
    public void stutter_test06() {
        assertEquals("in... in... incredible?", Challenges.stutter("incredible"));
    }

    @Test
    public void stutter_test07() {
        assertEquals("ex... ex... exquisite?", Challenges.stutter("exquisite"));
    }

    @Test
    public void stutter_test08() {
        assertEquals("am... am... am?", Challenges.stutter("am"));
    }

    @Test
    public void stutter_test09() {
        assertEquals("en... en... enduring?", Challenges.stutter("enduring"));
    }

    @Test
    public void stutter_test10() {
        assertEquals("ou... ou... outstanding?", Challenges.stutter("outstanding"));
    }

    @Test
    public void stutter_test11() {
        assertEquals("as... as... astonishing?", Challenges.stutter("astonishing"));
    }

    @Test
    public void stutter_test12() {
        assertEquals("as... as... astounding?", Challenges.stutter("astounding"));
    }

    @Test
    public void stutter_test13() {
        assertEquals("im... im... impressive?", Challenges.stutter("impressive"));
    }

    @Test
    public void stutter_test14() {
        assertEquals("re... re... revolutionize?", Challenges.stutter("revolutionize"));
    }

    @Test
    public void stutter_test15() {
        assertEquals("re... re... recurring?", Challenges.stutter("recurring"));
    }

    @Test
    public void stutter_test16() {
        assertEquals("re... re... recollection?", Challenges.stutter("recollection"));
    }

    @Test
    public void stutter_test17() {
        assertEquals("so... so... so?", Challenges.stutter("so"));
    }

    @Test
    public void stutter_test18() {
        assertEquals("go... go... gorgeous?", Challenges.stutter("gorgeous"));
    }

    @Test
    public void stutter_test19() {
        assertEquals("ca... ca... captivating?", Challenges.stutter("captivating"));
    }
}
