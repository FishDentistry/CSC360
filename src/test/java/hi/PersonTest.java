package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person r;
	Person j;
	Person m;
	Person y;

	@BeforeEach
	void setUp() throws Exception
	{
		r = new Person("Romeo","Mon",15);
		j = new Person("Juliet","Cap",13);
		m = new Person("Count","Dookie",54);
		y = new Person("Yo","Da",973);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Mon, 15",r.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	void testPerson() 
	{
		assertThrows(UnderAgeException.class,
				()->{
				    r.makePerson(j);
					//assertEquals(r.getFname(),child.getFname());
					//assertEquals(0,child.getAge());
					//assertEquals(j.getLname(),child.getLname());	
				});
		Person child;
		
		try
		{
			child = m.makePerson(y);
			assertEquals(m.getFname(),child.getFname());
			assertEquals(0,child.getAge());
			assertEquals(y.getLname(),child.getLname());
		} catch (UnderAgeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Threw exception");
		}	
	}

}
