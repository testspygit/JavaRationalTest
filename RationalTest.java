import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class RationalTest {
	
	int x = 9;
	@BeforeAll
	public static void setUpBeforeClass() {
	    System.out.println("Executing a JUNIT test file");
	}

	@AfterAll
	public static void tearDownAfterClass() {
	    System.out.println("Execution of JUNIT test file done");
	}

	@BeforeEach
	public void setItUp() {
	    System.out.println("Executing a new test");
	}

	@AfterEach
	public void tearDown()  {
	    System.out.println("Execution done");
	}

	@Test
	public void test_plus_1() {
		Rational x, y, z;
        x = new Rational(1, 5);
        y = new Rational(1, 9);
        z = x.plus(y);
        if (z.toString().equals("14/45"))        	
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Passed");
        else
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Failed");
	}

	@Test
	public void test_plus_2() {
		Rational x, y, z;
		x = new Rational(1, 1000);
        y = new Rational(1, 7000);
        z = x.plus(y);
        if (z.toString().equals("1/875"))        	
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Passed");
        else
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Failed");
	}
	
	@Test
	public void test_times() {
		Rational x, y, z;
		x = new Rational(8, 5);
        y = new Rational(3, 4);
        z = x.times(y);
        if (z.toString().equals("6/5"))        	
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Passed");
        else
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Failed");
	}
	
	@Test
	public void test_times_2() {
		Rational x, y, z;
		x = new Rational(56789, 1234);
        y = new Rational(12345, 897);
        z = x.times(y);
        if (z.toString().equals("233686735/368966"))        	
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Passed");
        else
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Failed");
	}
	
	@Test
	public void test_dividedBy() {
		Rational x, y, z;
		x = new Rational(1, 6);
        y = new Rational(4, 9);
        z = x.dividedBy(y);
        if (z.toString().equals("3/8"))        	
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Passed");
        else
        	System.out.println(x.toString() + " + " + y.toString() + " = " + z.toString() + ": Failed");
	}
	
	@Test
	public void test_toFloat() {
		Rational x;
        x = new Rational(3, 8);
        if (x.toFloat() == 0.375)        	
        	System.out.println(x.toString() + " in float is " + x.toFloat() + ": Passed");
        else
        	System.out.println(x.toString() + " in float is " + x.toFloat() + ": Failed");
	}
	
	@Test
	public void test_equals_1() {
		Rational x, y;
		x = new Rational(1, 6);
        y = new Rational(4, 9);
        if (x.equals(y) == false)        	
        	System.out.println(x.toString() + " == " + y.toString() + " is " + x.equals(y) + ": Passed");
        else
        	System.out.println(x.toString() + " in float is " + x.toFloat() + ": Failed");
	}
	
	@Test
	public void test_equals_2() {
		Rational x, y;
		x = new Rational(1, 9);
        y = new Rational(1, 9);
        if (x.equals(y) == true)        	
        	System.out.println(x.toString() + " == " + y.toString() + " is " + x.equals(y) + ": Passed");
        else
        	System.out.println(x.toString() + " in float is " + x.toFloat() + ": Failed");
	}
	
	@Test
	public void test_compareTo_1() {
		Rational x, y;
		x = new Rational(1, 6);
        y = new Rational(4, 9);
        if (x.compareTo(y) == -1) 
        	System.out.println(x.toString() + " when compared to " + y.toString() + " returned " + x.compareTo(y) + ": Passed");
        else
        	System.out.println(x.toString() + " when compared to " + y.toString() + " returned " + x.compareTo(y) + ": Failed");
	}
	
	@Test
	public void test_compareTo_2() {
		Rational x, y;
		x = new Rational(5, 11);
        y = new Rational(4, 9);
        if (x.compareTo(y) == 1) 
        	System.out.println(x.toString() + " when compared to " + y.toString() + " returned " + x.compareTo(y) + ": Passed");
        else
        	System.out.println(x.toString() + " when compared to " + y.toString() + " returned " + x.compareTo(y) + ": Failed");
	}

}
