package com.behavioralPatterns.observerPattern.demo2;

public class Observer1 implements IObserver{

	@Override
	public void update() {
		System.out.println("changes after flag change for observer 1 is  updated");
		
	}

}
