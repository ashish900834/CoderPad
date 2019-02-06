package com.capgemini.addition.junitest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class AdditionTest{
	private int value1;
	private int value2;
	
	Addition ad=new Addition();
	@Before
	public void setUp() throws Exception {
		
		value1=3;
		value2=5;
	}

	@Test
	public void additionTest(){
		
		int sum=ad.add(value1,value2);
		assertEquals(sum,8);
	}
	@Test
	public void substarctionTest(){
		int result=ad.sub(value2,value1);
		assertEquals(result,2);
		
	}
}
