package com.behavioralPatterns.iteratorPattern;

public class IteratorPatternEx {
	
	public static void main(String[] args) {
		
		System.out.println("***Iterator Pattern Demo***\n");
		
		ISubject Ar_subjects = new Arts();
		
		IIterator Ar_iterator = Ar_subjects.CreateIterator();
		
		System.out.println("\nArts subjects :");
		Print(Ar_iterator);
	}
	public static void Print(IIterator iterator)
	{
	while (!iterator.IsDone())
	{
	System.out.println(iterator.Next());
	}
	}
}
