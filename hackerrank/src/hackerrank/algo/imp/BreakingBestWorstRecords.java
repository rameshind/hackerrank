package hackerrank.algo.imp;

import java.util.Scanner;

public class BreakingBestWorstRecords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}

		int min, max;
		min = max = score[0];
		int minBr, maxBr;
		minBr = maxBr = 0;
		for (int i = 0; i < score.length; i++) {
			int curScr = score[i];
			if (max < curScr) {
				maxBr++;
				max = curScr;
				continue;
			}
			if (min > curScr) {
				minBr++;
				min = curScr;
			}
		}
		System.out.println(maxBr + " " + minBr);
	}

}
