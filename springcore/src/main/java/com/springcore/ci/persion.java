package com.springcore.ci;

public class persion {
private String name;
private int persionId;
private String add;
private Certi certi;


public persion(String name,int persionId,String add,Certi certi) {
	this.name=name;
	this.persionId=persionId;
	this.add=add;
	this.certi=certi;
	
}

@Override
public String toString() {
	return  this.name+" : "+this.persionId+" : "+this.add+"{"+this.certi.name+"}";
	
}

}
