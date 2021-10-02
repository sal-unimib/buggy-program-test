package se.kth.buggy_program_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void getNameTest() {
		Person p1 = new Person("Davide", "Ginelli", 1990);
		assertEquals("Davide", p1.getName());
	}
	
	
    @Test
    public void computeAgeTest() {
    	Person p1 = new Person("Davide", "Ginelli", 1990);
    	assertEquals(31, p1.wrongComputeAge());
    }
    
}
