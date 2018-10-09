package com.behavioralPatterns.templatePattern;

public abstract class BasicEngeneering {

	public void papers(){
		basicMath();
		mechanics();
		appliedScience();
		branchSpecific();
	}
	public void basicMath(){
		System.out.println("Basic Mathematics");
	}
	public void mechanics(){
		System.out.println("Mechanics");
	}
	public void appliedScience(){
		System.out.println("Applied Science");
	}
	public abstract void branchSpecific();
}
