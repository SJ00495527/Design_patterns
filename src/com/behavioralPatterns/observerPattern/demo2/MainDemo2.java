package com.behavioralPatterns.observerPattern.demo2;

public class MainDemo2 {

	public static void main(String[] args) {
	IObserver observer1 = new Observer1();
	IObserver observer2 = new Observer2();
	
	Subject s1 = new Subject();
	s1.register(observer1);
	s1.register(observer2);
	s1.set_flag(5);
	
	System.out.println("after removing 1 observer");
	s1.unregister(observer1);
	s1.set_flag(15);
	
	}

}
