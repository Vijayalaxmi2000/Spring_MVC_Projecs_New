package com.jsp.springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=
				new ClassPathXmlApplicationContext("com/jsp/springlifecycle/Student.xml");
		
		Student s1= (Student)c1.getBean("student");
		System.out.println(s1);
		
		Student s2 = (Student)c1.getBean("student");
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
