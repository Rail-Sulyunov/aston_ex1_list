import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CustomArrayListTest {

    private CustomArrayList<String> customArrayList;

    @BeforeEach
    void setUp() {
        customArrayList = new CustomArrayList<>();
        customArrayList.add("Rail");
    }

    @Test
    void add() {
        customArrayList.add("Liliya");
        Assertions.assertNotNull(customArrayList.get(1));
        Assertions.assertEquals("Liliya", customArrayList.get(1));
    }

    @Test
    void delete() {
        customArrayList.delete(0);
        Assertions.assertEquals(0, customArrayList.size());
    }
    @Test
    void get() {
        Assertions.assertEquals("Rail", customArrayList.get(0));
    }

    @Test
    void size() {
        customArrayList.add("Emil");
        Assertions.assertEquals(2, customArrayList.size());
    }

    @Test
    void update() {
        customArrayList.update(0,"Java");
        Assertions.assertEquals("Java", customArrayList.get(0));
    }

}