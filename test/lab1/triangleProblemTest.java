package lab1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class triangleProblemTest {
	
	private int input1;
	private triangleProblem a = null;
	
	public triangleProblemTest(int input1) {
		this.input1 = input1;
	}
	
	@Before
	public void setUp() {
		a = new triangleProblem();
	}

	@Parameters
	public static Collection<Object[]> getData() {
		Object[][] object = {{1},{2},{3},{5},{6},{7},
				{8},{10},{11},{12},{13},{20},{21},
				{22},{23},{25},{26},{27},{28},{30},
				{31},{32},{33},{51},{52},{56},{57},
				{58},{60},{61},{62},{63},{70},{71},
				{72},{73},{75},{76},{77},{78},{80},
				{81},{82},{83}};
		return Arrays.asList(object);
	}

	@Test
	public void testF() {
		assertTrue(a.f(input1));
	}

}
