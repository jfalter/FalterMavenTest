package com.falter.test;

public class Message 
{
	private String message;
	
	public Message(String newMessage)
	{
		this.message = newMessage;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
	
}
