import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementAndBranch() {
        IllegalArgumentException exception;
        exception = assertThrowsExactly(IllegalArgumentException.class,()->{SILab2.function(createList());});
        assertTrue(exception.getMessage().equals("List length should be greater than 0"));

        exception = assertThrowsExactly(IllegalArgumentException.class,()->{SILab2.function(createList("1","2","3","4","#"));});
        assertTrue(exception.getMessage().equals("List length should be a perfect square"));

        assertArrayEquals(SILab2.function(createList("#", "1", "1", "#", "2", "#", "1", "#", "1")).toArray(), createList(
                "#",
                "1",
                "1",
                "#",
                "3",
                "#",
                "2",
                "#",
                "2").toArray());
    }
}