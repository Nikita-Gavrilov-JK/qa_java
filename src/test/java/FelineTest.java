import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void eatMeatTest() throws Exception {
        Feline fel = new Feline();

        // Ожидаемый список еды, который вернёт getFood("Хищник")
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = fel.eatMeat();
        assertEquals(expected, actual);
    }
}
