package org.mallo.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mallo.web.util.TruncateUtil;

public class TruncateUtilJunit 
{
	@Test
	public void truncate()
	{		
		assertEquals("12 ... (truncated) ... 90", TruncateUtil.truncate("123456789012345678901234567890", 25));
		assertEquals("1234567890", TruncateUtil.truncate("1234567890", 5));
		assertEquals("123456789012345678901234567890", TruncateUtil.truncate("123456789012345678901234567890", 31));
		
		assertEquals("1234567890", TruncateUtil.truncate("1234567890", -1));
		assertEquals("1234567890", TruncateUtil.truncate("1234567890", 10));
		assertNotSame("... (truncated) ...", TruncateUtil.truncate("1234567890", 10));
	}
}
