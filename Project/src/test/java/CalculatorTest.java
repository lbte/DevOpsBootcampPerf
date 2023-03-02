import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
    // the instance of the object is unmodifiable
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(2, 3);
        assertThat(result, is(equalTo(5)));
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(3, 2);
        assertThat(result, is(equalTo(1)));
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 2);
        assertThat(result, is(equalTo(4)));
    }

    @Test
    public void TestDivide() {
        int result = calculator.divide(4, 2);
        assertThat(result, is(equalTo(2)));
    }
}