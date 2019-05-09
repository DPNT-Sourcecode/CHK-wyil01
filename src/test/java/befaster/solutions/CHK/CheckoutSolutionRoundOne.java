package befaster.solutions.CHK;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/*
| Item | Price | Special offers |
+------+-------+----------------+
| A    | 50    | 3A for 130     |
| B    | 30    | 2B for 45      |
| C    | 20    |                |
| D    | 15    |                |
+------+-------+----------------+

*/

public class CheckoutSolutionRoundOne {
	private CheckoutSolution chkSol;

	@Before 
	public void setUp()
	{
		chkSol = new CheckoutSolution();
	}
	@Test
	public void test() {
		
		assertThat(chkSol.checkout("4A,3B,C,D"), equalTo(300));
		
	}

}

