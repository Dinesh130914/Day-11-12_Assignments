package com.bl.decks;

public interface Icard {
	
	String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	String[] Ranks = {"2","3","4","5","6","7","8","9","J","Q","K","A"};
	
	public void init();
	public void shuffle();
	public void distribute();
	public void print();
	public void printdistributecard();
}
