package main;

import java.util.Scanner;

public class PhysicsPracticalRuntime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] measurements = new int[n];
		for (int i = 0; i < n; i++) {
			measurements[i] = sc.nextInt();
		}
		sc.nextLine();

		bubbleSort(measurements);
		int m = 0;
		for (int i = n-1; i > 0; i--) {
			if ((measurements[i] - measurements[0]) <= 2) {
				m = i+1;
				break;
			}
		}
		if (m > 0) {
			System.out.println(n - m);
		} else {
			System.out.println(0);
		}

	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i + 1 < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				int backward = arr[j];
				int forward = arr[j - 1];
				if (backward < forward) {
					arr[j] = forward;
					arr[j - 1] = backward;
				}
			}
		}
	}

}
