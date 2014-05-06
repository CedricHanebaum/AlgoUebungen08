package backtracking;

import java.util.ArrayList;

public class Zahlenfolge {

	public static void printPermutationen(int n){
		ArrayList<String> al = new ArrayList<String>();
		for(int i = 1; i <= n; ++i){
			al.add(i + "");
		}
		System.out.println(printPermutationen(al));
	}
	
	private static ArrayList<String> printPermutationen(ArrayList<String> al){
		if(al.size() == 1){
			ArrayList<String> ret = new ArrayList<String>();
			ret.add(al.get(0) + "");
			return ret;
		} else {
			ArrayList<String> ret = new ArrayList<String>();
			for(int i = 0; i < al.size(); ++i){
				ArrayList<String> clone = new ArrayList<String>(al);
				clone.remove(i);
				
				for(String s: printPermutationen(clone)){
					ret.add(al.get(i) + s);
				}
			}
			return ret;
		}
	}
	
	public static void main(String[] args) {
		printPermutationen(10);
	}
	
	
}
