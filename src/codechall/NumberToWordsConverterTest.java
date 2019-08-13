/**
 * 
 */
package codechall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author kevinbusch
 *
 */
class NumberToWordsConverterTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		String expected ="One";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(1);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		String expected ="One Hundred";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(100);
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		String expected ="One Thousand ";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(1000);
		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		String expected ="Two";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(2);
		assertEquals(expected, actual);
	}
	@Test
	void test6() {
		String expected ="Three";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(3);
		assertEquals(expected, actual);
	}
	@Test
	void test7() {
		String expected ="Four";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(4);
		assertEquals(expected, actual);
	}
	@Test
	void test8() {
		String expected ="Five";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(5);
		assertEquals(expected, actual);
	}
	@Test
	void test9() {
		String expected ="Six";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(6);
		assertEquals(expected, actual);
	}
	@Test
	void test10() {
		String expected ="Seven";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(7);
		assertEquals(expected, actual);
	}
	@Test
	void test11() {
		String expected ="Eight";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(8);
		assertEquals(expected, actual);
	}
	@Test
	void test12() {
		String expected ="Nine";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(9);
		assertEquals(expected, actual);
	}
	@Test
	void test13() {
		String expected ="Ten";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(10);
		assertEquals(expected, actual);
	}
	@Test
	void test14() {
		String expected ="Twenty";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(20);
		assertEquals(expected, actual);
	}
	@Test
	void test15() {
		String expected ="Thirty";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(30);
		assertEquals(expected, actual);
	}
	@Test
	void test16() {
		String expected ="Fourty";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(40);
		assertEquals(expected, actual);
	}
	@Test
	void test17() {
		String expected ="Fifty";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(50);
		assertEquals(expected, actual);
	}
	@Test
	void test18() {
		String expected ="Sixty";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(60);
		assertEquals(expected, actual);
	}
	@Test
	void test19() {
		String expected ="Seventy";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(70);
		assertEquals(expected, actual);
	}
	@Test
	void test20() {
		String expected ="Eighty";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(80);
		assertEquals(expected, actual);
	}
	@Test
	void test21() {
		String expected ="Ninety";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(90);
		assertEquals(expected, actual);
	}
	@Test
	void test22() {
		String expected ="Eleven";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(11);
		assertEquals(expected, actual);
	}
	@Test
	void test23() {
		String expected ="Twelve";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(12);
		assertEquals(expected, actual);
	}
	@Test
	void test24() {
		String expected ="Thirteen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(13);
		assertEquals(expected, actual);
	}
	@Test
	void test25() {
		String expected ="Fourteen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(14);
		assertEquals(expected, actual);
	}
	@Test
	void test26() {
		String expected ="Fifteen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(15);
		assertEquals(expected, actual);
	}
	@Test
	void test27() {
		String expected ="Sixteen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(16);
		assertEquals(expected, actual);
	}
	@Test
	void test28() {
		String expected ="Seventeen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(17);
		assertEquals(expected, actual);
	}
	@Test
	void test29() {
		String expected ="Eighteen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(18);
		assertEquals(expected, actual);
	}
	@Test
	void test30() {
		String expected ="Nineteen";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(19);
		assertEquals(expected, actual);
	}
	@Test
	void test31() {
		String expected ="Ten Thousand";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(10000);
		assertEquals(expected, actual);
	}
	@Test
	void test32() {
		String expected ="One Million ";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(1000000);
		assertEquals(expected, actual);
	}
	@Test
	void test33() {
		String expected ="One Billion";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(1000000000);
		assertEquals(expected, actual);
	}
	@Test
	void test34() {
		String expected ="One Hundred Thousand";
		NumberToWordsConverter n = new NumberToWordsConverter();
		String actual = n.convert(100000);
		assertEquals(expected, actual);
	}

}
