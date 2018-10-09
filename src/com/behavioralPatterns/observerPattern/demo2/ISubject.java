package com.behavioralPatterns.observerPattern.demo2;

public interface ISubject {

	public void register(IObserver o);
	public void unregister(IObserver o);
	public void notifyObserver();
}
