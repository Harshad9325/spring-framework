package com.springcore.ci;

public class Adition {
private int A;
private  int B;

public Adition(double a,double b) {
	this.A=(int)a;
	this.B=(int) b;
	System.out.println("constructor :double, double");
}
public Adition(int a,int b) {
	this.A=a;
	this.B=b;
	System.out.println("constructor :int, int");
}

public Adition(String a,String b) {
	this.A=Integer.parseInt(a);
	this.B=Integer.parseInt(b);
	System.out.println("constructor :String, S");
}

public Adition(int a,String b) {
	this.A=a;
	this.B=Integer.parseInt(b);
	System.out.println("constructor :int, String");
}

public void doSum1() {
	System.out.println("Sum is "+(this.A+this.B));
}




}
