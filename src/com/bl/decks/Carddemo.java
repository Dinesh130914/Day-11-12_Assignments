package com.bl.decks;

public class Carddemo {
	public static void main(String[] args) 
	{
		Icard icard = new Deckofcard();
		icard.print();
		icard.shuffle();
		System.out.println("---------Afetr Shuffle-----------");
		icard.print();
		
		icard.distribute();
		icard.printdistributecard();
		
	}
}
