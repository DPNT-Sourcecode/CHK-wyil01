package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import befaster.solutions.HLO.HelloSolution;

public class HelloSolutionTest {
	
	private HelloSolution hello;

	  @Before
	    public void setUp() {

	        hello = new HelloSolution();
	    }
	@Test
	public void test() {
		assertThat(hello.hello("John").toString(), equalTo("Hello, John!") );
	}

}
