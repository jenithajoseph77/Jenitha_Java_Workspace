package com.deda;

public class VariableEg {

	int num1= 23;
	int num2 = 20;
	
	public void add() {
		System.out.println("Addition " +(num1+num2));
	}
	
	public void sub() {
		System.out.println("Subtraction"+(num1-num2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableEg v1 = new VariableEg();
		v1.add();
		v1.sub();
		VariableEg v2 = new VariableEg();
		v2.add();
		v2.sub();
		
		
	}

}
