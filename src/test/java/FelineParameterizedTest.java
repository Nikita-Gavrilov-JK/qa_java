import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int numKit;
    private final int expectedKit;

    public FelineParameterizedTest(int numKit, int expectedKit) {
        this.numKit = numKit;
        this.expectedKit = expectedKit;
    }

    @Parameterized.Parameters(name = "{index}: getKittens({0}) = {1}")
    public static Object[][] data() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {5, 5},
                {10, 10}
        };
    }
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(expectedKit, feline.getKittens(numKit));
    }
}
