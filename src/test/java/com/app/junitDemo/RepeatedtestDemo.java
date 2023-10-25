package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedtestDemo {
	@RepeatedTest(4)
	// execute this test 3 times
	@DisplayName("repeatedtests")
	public void repeatmessage()
	{
		System.out.println("We are login Facebook");
	}

	@Test
	public void AssumptionsDemo()
	{
		// i want to run the test cases only and only if my DB server is Up and running
		
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp,"server is not Up");
		
		System.out.println("Create tables and instert data");
		
	}
	
}
