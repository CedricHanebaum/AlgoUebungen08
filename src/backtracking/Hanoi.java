package backtracking;

import java.util.ArrayList;

public class Hanoi {

	public static void printBewegungen(int n, int start, int ziel){
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		al.remove((Integer)ziel);
		al.remove((Integer)start);
		
		bewege(n, start, al.get(0), ziel);
	}
	
	private static void bewege(int n, int a, int b, int c){
		if(n > 0){
			bewege(n - 1, a, c, b);
			System.out.println("Bewege Scheibe von " + a + " nach " + c);
			bewege(n - 1, b, a, c);
		}
	}
	
	public static void main(String[] args) {
		printBewegungen(3, 1, 2);
	}
	
}
