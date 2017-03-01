package pkgMyInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cisc181.SFrketich.PS2.MyInteger;

public class MyInteger_Test {

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
	public void TestIsEven() {
		
		MyInteger flaven = new MyInteger(2);
		boolean bExpected = true;
		
		assertEquals(bExpected,flaven.isEven());
	}
	@Test
	public void TestIsOdd()
	{
		MyInteger flaven = new MyInteger(2);
		boolean bExpected = false;
		
		assertEquals(bExpected,flaven.isOdd());
	}
	@Test
	public void TestIsPrime()
	{
		MyInteger flaven = new MyInteger(2);
		boolean bExpected = true;
		
		assertEquals(bExpected,flaven.isPrime());
	}
	@Test
	public void TestIsEvenInt() {
		int x = 5;
		boolean bExpected = false;
		
		assertEquals(bExpected,MyInteger.isEven(x));
	}
	@Test
	public void TestIsOddInt() {
		int x = 5;
		boolean bExpected = true;
		
		assertEquals(bExpected,MyInteger.isOdd(x));
	}
	@Test
	public void TestIsPrimeInt() {
		int x = 5;
		boolean bExpected = true;
		
		assertEquals(bExpected,MyInteger.isPrime(x));
	}
	@Test
	public void TestIsEvenInteger() {
		MyInteger flaven = new MyInteger(6);
		boolean bExpected = true;
		
		assertEquals(bExpected,MyInteger.isEven(flaven));
	}
	@Test
	public void TestIsOddInteger() {
		MyInteger flaven = new MyInteger(6);
		boolean bExpected = false;
		
		assertEquals(bExpected,MyInteger.isOdd(flaven));
	}
	@Test
	public void TestIsPrimeInteger() {
		MyInteger flaven = new MyInteger(6);
		boolean bExpected = false;
		
		assertEquals(bExpected,MyInteger.isPrime(flaven));
	}
	@Test
	public void TestEquals() {
		MyInteger flaven = new MyInteger(7);
		int x = 7;
		boolean bExpected = true;
		
		assertEquals(bExpected,flaven.equals(x));
	}
	@Test
	public void TestEqualsInteger() {
		MyInteger flaven = new MyInteger(6);
		MyInteger boo = new MyInteger(7);
		boolean bExpected = false;
		
		assertEquals(bExpected,flaven.equals(boo));
	}
	
	
	

}
