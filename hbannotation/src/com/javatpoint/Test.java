package com.javatpoint;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Test {
public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	Employee e1=new Employee();	
	e1.setId(101);
	e1.setFirstName("krishna");
	e1.setLastName("a");
	session.save(e1);
	t.commit();
	session.close();
	System.out.println("successfully updated");
}
}
