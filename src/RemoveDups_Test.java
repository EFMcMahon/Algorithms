import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class RemoveDups_Test {
    @Test
    public void removeDups_test1() {
        assertArrayEquals(Challenges.removeDups(new String[]{"John", "Taylor", "John"}), (new String[]{"John", "Taylor"}));
    }

    @Test
    public void removeDups_test2() {
        assertArrayEquals(Challenges.removeDups(new String[]{"John", "Taylor", "John", "john"}), (new String[]{"John", "Taylor", "john"}));
    }

    @Test
    public void removeDups_test3() {
        assertArrayEquals(Challenges.removeDups(new String[]{"javascript", "python", "python", "ruby", "javascript", "c", "ruby"}), (new String[]{"javascript", "python", "ruby", "c"}));
    }

    @Test
    public void removeDups_test5() {
        assertArrayEquals(Challenges.removeDups(new String[]{"#", "#", "%", "&", "#", "$", "&"}), (new String[]{"#", "%", "&", "$"}));
    }
}
