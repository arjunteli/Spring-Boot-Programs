package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Laptop;
import com.kn.bean.Student;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cong = new ClassPathXmlApplicationContext("application-context.xml");
		Student s1 = (Student) cong.getBean("s1");
		System.out.println("Object has been created "+ s1);
		
		System.out.println("******************************");
		
		Laptop l1 = (Laptop) cong.getBean("s2");
		System.out.println("Object has been created "+ l1);
		
		System.out.println("******************************");
		Laptop l2 = (Laptop) cong.getBean("s2");
		l2.setSerialNumber(102);
		l2.setManufacturer("HP");
		l2.setCost(34567.7654);
		System.out.println("Object has been created "+ l2);
	}

}
