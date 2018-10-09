package com.behavioralPatterns.observerPattern.demo2;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

	private int _flag;
	
	private List<IObserver> obsList = new ArrayList<>();
	
	public int get_flag() {
		return _flag;
	}

	public void set_flag(int _flag) {
		this._flag = _flag;
		notifyObserver();
	}

	@Override
	public void register(IObserver o) {
		obsList.add(o);
		
	}

	@Override
	public void unregister(IObserver o) {
		
		obsList.remove(o);
	}

	@Override
	public void notifyObserver() {
		
		obsList.stream().forEach(o -> o.update());
	}

}
