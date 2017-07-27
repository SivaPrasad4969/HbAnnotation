package com.javatpoint;

public class StringDemo {

	public static void main(String[] args) {
		String s="abcdeeedcbfgf";
		System.out.println(s);
		boolean flag=true;
		char s1[]=new char[s.length()];
		while(flag){
		
		for(int i=0,k=0;i<s.length();i++){
			if(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)){
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(i)==s.charAt(j)){
						i++;
						flag=true;
					}
					}
				i++;
				}
			else{
				flag=false;
			}
			s1[k]=s.charAt(i);
			k++;
			}
		 s=new String(s1);
		s.trim();
		
		System.out.println(s);
		System.out.println(s.length());
		/*for(int i=0;i<s.length();i++){
			if(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)){
				flag=true;
				break;
			}
		}*/
		}
		System.out.println(s);
		System.out.println(s.length());
		
		}
	

}
