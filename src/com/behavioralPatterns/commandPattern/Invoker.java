package com.behavioralPatterns.commandPattern;

public class Invoker {

	private ICommand cmd;
	
	public void executeCommand(ICommand cmd){
		this.cmd=cmd;
		cmd.Do();
	}
}
