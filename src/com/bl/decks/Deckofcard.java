package com.bl.decks;



public class Deckofcard implements Icard {
	
	String[] decks = new String[52];
	String[][] cards = new String[9][4];
	int index;
	
	public Deckofcard() 
	{
		init();
	}

	@Override
	public void init() {
		for (int i = 0; i <= decks.length; i++) {
			decks[i] = Ranks[i%13]+suits[i/13];
		}
	}

	@Override
	public void shuffle() {
		for (int i = 0; i < decks.length; i++) {
			int random = (int) (Math.random()*decks.length);
			String temp = decks[i];
			decks[i] = decks[random];
			decks[random] = temp;
		}
		
	}

	@Override
	public void distribute() {
		for(int j=0;j<9;j++) 
		{
			for(int k = 0;k<4;k++) 
			{
				cards[j][k] = decks[index++];
			}
		}
		
	}

	@Override
	public void print() {
		for (int i = 0; i < decks.length; i++) {
			System.out.println(decks[i]);
		}
		
	}
	@Override
	public void printdistributecard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println(cards[i][j]);
			}
			System.out.println("\n");
		}
		
	}
	
}
