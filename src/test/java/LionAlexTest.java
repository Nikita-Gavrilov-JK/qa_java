import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex alex = new LionAlex(new Feline());
        List<String> expectedListFriends  = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedListFriends, alex.getFriends());
    }
    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex alex = new LionAlex(new Feline());
        String expectedCity = "Нью-Йоркский зоопарк";
        assertEquals(expectedCity, alex.getPlaceOfLiving());
    }
    @Test
    public void getKittensTest() throws Exception {
        LionAlex alex = new LionAlex(new Feline());
        assertEquals(0, alex.getKittens());
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        LionAlex alex = new LionAlex(new Feline());
        assertEquals(true, alex.doesHaveMane());
    }
}
