
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RpnCalculatorTests {
	
	RpnCalculator rpnc = new RpnCalculator();
	
	@Test
	public void isZeroTest() {
		assertThat(rpnc.getAccumulator(), is(0));
	}
	
	@Test
	public void setAccumulatorTest() {
		rpnc.setAccumulator(5);
		assertEquals(rpnc.getAccumulator(), 5);
	}
	
	@Test
	public void calculateTest1() {
		assertThat(rpnc.calculate("1 2 +"), is(3));
	}
	
	@Test
	public void calculateTest2() {
		assertThat(rpnc.calculate("1 2 + 4 *"), is(12));
	}
	
	@Test
	public void calculateTest3() {
		assertThat(rpnc.calculate("4 3 + 2 1 + *"), is(21));
	}
}
