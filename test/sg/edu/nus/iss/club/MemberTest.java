package sg.edu.nus.iss.club;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}
	
	
	public void testSameNameDifferentMembershipNumber(){
		Member member1 = new Member("Lim", "Hean Soon", null, 123);
		Member member2 = new Member("Lim", "Hean Soon", null, 123);
		//Member test2 = new Member("Lim", "Hean Soon", null, 1234);
		//assertEquals(test1, new Member("Lim", "Hean Soon", null, 1234));
		int test = 1;
		int test2 = 1;
		
		//member1.getSurname();
		
		
		//assertEquals(member1,member2);
		assertNotNull(member1.getSurname());
		assertEquals(member1.getSurname(),member2.getSurname());
		assertFalse(member1.equals(member2));
	}
	
	@Test
	public void testMiddleNameNull(){
		Member member1 = new Member("Lim", "Hean Soon", null, 123);
		//Member test2 = new Member("Lim", "Hean Soon", null, 1234);
		//assertEquals(test1, new Member("Lim", "Hean Soon", null, 1234));
		int test = 1;
		int test2 = 1;
		
		//member1.getSurname();
		
		
		//assertEquals(member1,member2);
		assertNull(member1.getSecondName());
		//assertEquals(member1.getSurname(),member2.getSurname());
		//assertTrue(!member1.equals(member2));
	}

}
