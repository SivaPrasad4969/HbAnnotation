package com.javatpoint;

public class Test1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcdeedcbfgf");
		System.out.println(sb.length());
		sb.delete(4,6);
		System.out.println(sb.length());
	}
	
    
}
