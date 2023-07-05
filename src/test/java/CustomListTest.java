import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class CustomListTest {

    private String name;
    private String name1;
    private String name2;


    @BeforeEach
    void setUp() {
        CustomList customList = new CustomList<>();
        name = "Rail";
        name1 = "Liliya";
        name2 = "Emil";
    }

    @Test
    void add() {
        List<String> expected = CustomList.add();

        List<String> actual = new ArrayList<>();
        actual.add(name);
        actual.add(name1);
        actual.add(name2);

        Assertions.assertEquals(,actual);
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void size() {
    }

    @Test
    void update() {
    }

    @Test
    void iterator() {
    }
}