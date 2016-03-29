package com.falter.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMessage 
{
	String text = "Hello World";
	Message message = new Message(text);
	
	@Test
	public void testPrintMessage()
	{
		assertEquals(text, message.printMessage());
	}
	
	@Test
	public void testPrintMessageFailure()
	{
		String badText = "Hello Kitty";
		assertEquals(badText, message.printMessage());
	}
}
