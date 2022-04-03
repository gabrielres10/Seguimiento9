package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExactSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = 0;
			for (int k = 0; k < 2; k++) {
				N = 0;
				//
				N = sc.nextInt();
				ArrayList<Integer> books = new ArrayList<>();
				for (int i = 0; i < N; i++) {
					books.add(sc.nextInt());
				}
				int M = sc.nextInt();
				Collections.sort(books);
				ArrayList<Integer> possibilities = new ArrayList<>();
				for (int i = 0; i < N; i++) {
					if (books.get(i) < M) {
						possibilities.add(books.get(i));
					} else {
						break;
					}
				}

				ArrayList<Integer> is = new ArrayList<>();
				ArrayList<Integer> js = new ArrayList<>();

				for (int i = 0; i < possibilities.size(); i++) {
					for (int j = 0; j < possibilities.size(); j++) {
						if ((possibilities.get(i) + possibilities.get(j)) == M) {
							if (!is.contains(possibilities.get(i))) {
								is.add(possibilities.get(i));
							}
							if (!js.contains(possibilities.get(j))) {
								js.add(possibilities.get(j));
							}
							break;
						}
					}
				}

				int x = js.get(0);
				int y = is.get(0);
				for (int i = 0; i + 1 < is.size(); i++) {
					int less = Math.abs(js.get(i + 1) - is.get(i + 1));
					x = js.get(i);
					y = is.get(i);
					if (Math.abs(x - y) > less) {
						x = js.get(i + 1);
						y = is.get(i + 1);
					}
				}

				System.out.println("Peter should buy books whose prices are " + x + " and " + y + ".");
				System.out.println("");
				//
			}
		}
	}
}