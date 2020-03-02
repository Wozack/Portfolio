package com.fibbannaci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibTest {

	@Test
	
	public void recursionTest() {
		
		Runner fibbo = new Runner();
		
			assertEquals(102,334,155, fibbo.recursiveFib(40));
		}
	}

