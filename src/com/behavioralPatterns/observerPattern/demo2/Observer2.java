package com.behavioralPatterns.observerPattern.demo2;

public class Observer2 implements IObserver{

	@Override
	public void update() {
		System.out.println("changes after flag change for observer 2 is updated");
		
	}

}
