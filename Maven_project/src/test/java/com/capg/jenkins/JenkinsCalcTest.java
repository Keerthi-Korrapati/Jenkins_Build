package com.capg.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	
	
	@Test
	public void addtest() {
		Demo mycalc=new Demo();
		assertEquals(10,mycalc.addNumbers(5, 5));
	}
	
	@Test
	public void subtest() {
		Demo mycalc=new Demo();
		assertEquals(5,mycalc.substractNumbers(10, 5));
	}

}
