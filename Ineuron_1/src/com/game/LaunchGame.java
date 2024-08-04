package com.game;
import java.util.*;
//Console base application.
//There will be three properties for this game : Players:3, Guesser:1, Umpire:1
//First Guesser will guess name within given range & Players will guess the number and Umpire will announce the result by comparing it.
//we are creating this game using object oriented programming and we have used 3 objects.

class Guesser {
	int guessNum;
	
	public int guessNum(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guesser guess the number: ");
		guessNum =scan.nextInt();
		
		return guessNum;
	}
	
	
}
class Player{
	
	int pguessNum;
	
	public int pguessNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly guess number: ");
		
		pguessNum = scan.nextInt();	
		return pguessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
		public void collectFromGuesser() {
			
			Guesser g=new Guesser();
			numFromGuesser=g.guessNum();
			
		}
		public void collectFromPlayer() {
			
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			
			numFromPlayer1=p1.pguessNum();
			numFromPlayer2=p2.pguessNum();
			numFromPlayer3=p3.pguessNum();
			
		}
		
		public void compare() {
			
			if(numFromPlayer1==numFromGuesser) {
				
				if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser) {
					System.out.println("Game tied! All Players has won the game.");
					
				}
				else if(numFromPlayer2==numFromGuesser) {
					System.out.println("Player 1 & 2 has won the game.");
					
				}
				else if(numFromPlayer3==numFromGuesser  ) {	
					System.out.println("Player 1 & 3 has won the game.");
				}
				else {
					System.out.println("Player 1 has won the game");
				}
			}
			else if(numFromPlayer2==numFromGuesser) {
				
				if(numFromPlayer3==numFromGuesser)
					
				{
					System.out.println("Player 2 & 3 has won the game");
					
				}
				else {
					System.out.println("Player 2 has won the game");
				}
				
			}
			else if(numFromPlayer3==numFromGuesser) {
				System.out.println("Player 3 has won the game");
			}
			else {
				System.out.println("Game lost! Try again...");
			}
		}
		
	
}

public class LaunchGame{
	
	public static void main(String[] args) {
		Umpire up = new Umpire();
		up.collectFromGuesser();
		up.collectFromPlayer();
		up.compare();
		
	}
}
