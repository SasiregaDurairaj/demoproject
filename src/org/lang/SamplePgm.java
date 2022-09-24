package org.lang;

public class SamplePgm {
	
	public static void main(String[] args) {
		System.out.println("String Concepts.........");
        String s5="Jey";
		String s="Welcome";
		String s1="";
		String s2="GreensTechnology";
		String s3="    9626357157      ";
		String s4="Welcome";
		
		int k=s3.indexOf('7');
		System.out.println(k);				
		
		char abc=s.charAt(1); // used to find the particular letter by using index value.
		System.out.println(abc);
		
		int val=s.indexOf('l'); // used to find the first index value of particular letter.
		System.out.println(val);
		
		int val1=s.lastIndexOf('e'); // used to find the last index value of particular letter.
		System.out.println(val1);
		
		int va=s2.lastIndexOf('o');
		System.out.println(va);
		
		String low=s.toLowerCase();
		System.out.println(low);
		
		String up=s.toUpperCase();
		System.out.println(up);
		
		boolean emp=s.isEmpty(); // to check whether the string is empty or not.
		System.out.println(emp);
		
		boolean emp1=s1.isEmpty();
		System.out.println(emp1);
		
		boolean re=s.startsWith("Wel"); // to check whether the string starts with particular value
		System.out.println(re);
		
		boolean re1=s.startsWith("come");
		System.out.println(re1);
		
		boolean ch=s.endsWith("come"); // to check whether the string ends with particular value
		System.out.println(ch);
				
		int len=s3.length();
		System.out.println(len);
		
		boolean con=s.contains("Wel");// to check whether the string contains the particular value or not.
		System.out.println(con);
		
		boolean eq=s.equals(s4); // to compare 2 strings and its case sensitive.
		System.out.println(eq);
		
		boolean equ=s.equalsIgnoreCase(s4); // to compare 2 strings without case sensitive.
		System.out.println(equ);
		
		int com=s.compareTo(s4); // to compare 2 strings based on ASCII value.
		System.out.println(com);
		
		String rep=s.replace('e', 'a'); // 
		System.out.println(rep);
		
		String repa=s2.replaceAll("Green" ,"Red");
		System.out.println(repa);
		
		System.out.println(s3);
		String tr=s3.trim();
		System.out.println(tr);
		
		String sub=s.substring(2);
		System.out.println(sub);
		
		String sub1=s2.substring(0,10);
		System.out.println(sub1);
		
		
		
		
				
	}
	
}
