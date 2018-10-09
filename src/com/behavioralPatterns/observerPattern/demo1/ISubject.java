package com.behavioralPatterns.observerPattern.demo1;

public interface ISubject {

	void register(Observer o);
	void unregister( Observer o);
	void notifyObservers();
}
