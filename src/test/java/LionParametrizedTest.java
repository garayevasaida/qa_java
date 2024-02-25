import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    Feline feline = new Feline();
    private String sex;
    private boolean expectedMane;

    public LionParametrizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] getManeParam() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveNameTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        assertEquals(expectedMane, lion.doesHaveMane());
    }
}
