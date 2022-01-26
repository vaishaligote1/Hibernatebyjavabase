package com.javabase;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	
	Session session=HibernetUtil.getSessiomFactory().openSessiom();
	
	Student stu=new Student();
	stu.setId(2);
	stu.setName("yamin");
	stu.setAddress("bombay");
	
}
}
