import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    private String name;
    private String name1;
    private String name2;

    @BeforeEach
    void setUp() {
        name = "Rail";
        name1 = "Liliya";
        name2 = "Emil";
    }



    @org.junit.jupiter.api.Test
    public void add() {

        List<String> expected = .add();

        List<String> actual = new List<>();
        actual.add(name);
        actual.add(name1);
        actual.add(name2);

        Assertions.assertEquals(,actual);
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void update() {
    }

    @org.junit.jupiter.api.Test
    void iterator() {
    }


}