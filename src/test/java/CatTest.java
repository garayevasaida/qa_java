import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testGetSound() {
        Cat сat = new Cat(feline);
        assertEquals("Мяу", сat.getSound()); // проверяем, что значение корректное
    }

    @Test
    public void testGetFoodCat() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба")); // создаем стаб, чтоб проверить, что при вызове метода нам вернется заданное значение
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood()); // проверяем, что значение корректное

    }
}
