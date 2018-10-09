package com.behavioralPatterns.templatePattern;

public class MainDemo {

	public static void main(String[] args) {
		BasicEngeneering engeneering = new ComputerScience();
		engeneering.papers();
		System.out.println("---------------------------------");
		BasicEngeneering engeneering2 = new ElectronicScience();
		engeneering2.papers();
	}

}
