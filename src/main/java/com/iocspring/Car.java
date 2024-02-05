package com.iocspring;

public class Car {
	
	IEngine iEngine;

	/*
	 * //setter injection public void setiEngine(IEngine iEngine) { this.iEngine =
	 * iEngine; }
	 */
	
	
	//constructor
	public Car(IEngine iEngine) {
		super();
		this.iEngine = iEngine;
	}



	public void drive() {
		
		int engStatus = iEngine.start();
		if (engStatus == 1) {
			System.out.println("Journey Started Successfully");
			
		}else {
			System.out.println("Journey Failed");
		}
	}
	

	
}
