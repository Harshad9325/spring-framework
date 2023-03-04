package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class example {
public static Object example1;
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "example [subject=" + subject + "]";
}

@PostConstruct
public void start() {
	System.out.println("starting method");
}
@PreDestroy
public void end() {
	
	System.out.println("end methode");
}

}
