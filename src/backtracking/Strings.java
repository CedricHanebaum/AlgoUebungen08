package backtracking;

import java.util.ArrayList;

public class Strings {

	public static void printPermutationen(int n, int ges) {
		System.out.println(printPermutationenP(n, ges));
	}

	private static ArrayList<String> printPermutationenP(int n, int ges) {
		if (n == ges) {
			String s = "";
			ArrayList<String> ret = new ArrayList<String>();
			for (int i = 0; i < ges; ++i) {
				s += "1";
			}
			ret.add(s);
			return ret;
		}
		if (n == 0) {
			String s = "";
			ArrayList<String> ret = new ArrayList<String>();
			for (int i = 0; i < ges; ++i) {
				s += "0";
			}
			ret.add(s);
			return ret;
		}

		ArrayList<String> ret = new ArrayList<String>();

		for (String s : printPermutationenP(n - 1, ges - 1)) {
			ret.add("1" + s);
		}

		for (String s : printPermutationenP(n, ges - 1)) {
			ret.add("0" + s);
		}

		return ret;
	}

	public static void main(String[] args) {
		printPermutationen(2, 4);
	}

}
