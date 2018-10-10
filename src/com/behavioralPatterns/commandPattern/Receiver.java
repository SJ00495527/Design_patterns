package com.behavioralPatterns.commandPattern;

public class Receiver {

	public void performRedo(){
		System.out.println("Executing -MyRedoCommand");
	}
	
	public void performUndo(){
		System.out.println("Executing -MyUndoCommand");
	}
}
