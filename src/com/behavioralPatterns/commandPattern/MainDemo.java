package com.behavioralPatterns.commandPattern;

public class MainDemo {

	public static void main(String[] args) {
		
		
		System.out.println("***Command Pattern Demo***\n");
		Receiver intendedreceiver=new Receiver();
		/*Client holds Invoker and Command Objects*/
		Invoker inv = new Invoker();
		MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
		MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
		inv.executeCommand(unCmd);
		inv.executeCommand(reCmd);
	}
}
