package org.lang;

public class StringType {
	
	public static void main(String[] args) {
		
		String s="sasi";
		String s1="sasi";
		
		System.out.println("Literal String....");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		String s2=new String("John");
		String s3=new String("John");
		System.out.println("-------------------------------");
		System.out.println("Non Literal String....");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("-------------------------------");
		System.out.println("Immutable String");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		s=s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println("-------------------------------");
		System.out.println("Mutable String");
		
		StringBuffer s4=new StringBuffer("jey");
		StringBuffer s5=new StringBuffer("karthi");
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		
		s4=s4.append(s5);
		System.out.println(s4);
		System.out.println(System.identityHashCode(s4));
		
		
		
	}

}
