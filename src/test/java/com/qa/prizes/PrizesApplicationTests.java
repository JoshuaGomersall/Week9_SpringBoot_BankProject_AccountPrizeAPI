package com.qa.prizes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mockitoSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.controller.PrizeEndpoints;
import com.qa.domain.AccountEntity;
import com.qa.prizes.service.Prizes;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrizesApplicationTests {

	@Test
	public void TestNothing() {
		assertEquals("$0", Prizes.prizes("a123456"));
	}

	@Test
	public void Test50() {
		assertEquals("$50", Prizes.prizes("b123456"));
	}

	@Test
	public void Test100() {
		assertEquals("$100", Prizes.prizes("c123456"));
	}

	@Test
	public void TestNothing2() {
		assertEquals("$0", Prizes.prizes("a12345678"));
	}

	@Test
	public void Test500() {
		assertEquals("$500", Prizes.prizes("b12345678"));
	}

	@Test
	public void Test1000() {
		assertEquals("$1,000", Prizes.prizes("c12345678"));
	}

	@Test
	public void TestNothing3() {
		assertEquals("$0", Prizes.prizes("a1234567891"));
	}

	@Test
	public void Test5000() {
		assertEquals("$5,000", Prizes.prizes("b1234567891"));
	}

	@Test
	public void Test10000() {
		assertEquals("$10,000", Prizes.prizes("c1234567891"));
	}

	@Test
	public void TestNothing4() {
		assertEquals("$0", Prizes.prizes("a1234567"));
	}

	@Test
	public void AccountEntityTest() {
		AccountEntity test = new AccountEntity();
		test.setAccNumber("A123456");
		test.setId(1l);
		assertEquals("A123456", test.getAccNumber());
		assertEquals(1, test.getId());
		assertEquals("AccountEntity [id=1, accNumber=A123456]", test.toString());
		
		PrizesApplication test1 = new PrizesApplication();
		com.qa.PrizesApplication test2 = new com.qa.PrizesApplication();
		test.getAccNumber();
	}
	
	
	
	
	@Test
	public void TestNoth() {
		assertEquals("$0", Prizes.prizes("a1234567"));
	}
	
	
	private static final String MOCK_VALUE = "1";
	private static final String MOCK_VALUE2 ="1";

	@InjectMocks
	private PrizeEndpoints endpoint;

	@Mock
	private Prizes service;

	@Test
	public void TestMockito() {
		
	}
}
