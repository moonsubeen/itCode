package com.my.cjava;

import java.util.Scanner;

public class Level2 {
	public String msg;
	public int length;
	
	public Level2(String msg)
		{	
			this.msg = msg;
			this.length = msg.length();
		}
	public void printin()
	{
		System.out.println(msg);
	}
	
	public void printlength()
	{
		System.out.println(length);
	}
	
	public void printreplace()
	{
		String replace = msg.replaceAll("[abc]", "x");
		System.out.println(replace);
	}
}
//	public void {
//		String a = msg.toUpperCase();
//		System.out.println(a);
//		String b = msg.toLowerCase();
//		System.out.println(b);
//	}

