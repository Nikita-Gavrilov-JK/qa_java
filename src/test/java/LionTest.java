import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    @Test
    public void getKittensTest() throws Exception {
          Feline feline = new Feline();
//        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = Arrays.asList("Животные", "Птицы", "Рыба");
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(food);

        Lion lion = new Lion("Самец", felineMock);
        assertEquals(food, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void getException() throws Exception {
        Lion lion = new Lion("Сам", new Feline());
    }
}
