package Marina;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Marina.Calc.Calc;

public class CalcTest {
	@Test
	public void Calc() {

	Calc app = new Calc();
	assertEquals(10, app.main(6, 4));
	
		
		
		
		
	}
	

}
