import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters(name = "{index}: sex={0}, hasMane={1}")
    public static Object[][] data() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
