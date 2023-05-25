package com.deda;

interface vehicle {
	public void brake();
	
}

interface bike extends vehicle{
	public void engine();
}

class InterfaceEx implements vehicle,bike{
	
	
	public void brake() {
		System.out.println("vehicle has brake");
		
	}
	public void engine()
	{
		System.out.println("bike has engine");
		
	} 
	
	
	
	public static void main(String[] args) {
		
		InterfaceEx ie = new InterfaceEx();
		ie.brake();
		ie.engine();
		
	}
}
