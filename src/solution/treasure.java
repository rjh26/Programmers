package solution;

import java.io.*;
import java.util.*;

public class treasure {//백준 1026번 보물
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int answer = 0;
		
		Integer[] tA = new Integer[tc];
		Integer[] tB = new Integer[tc];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < tc; i++) {
			int numA = Integer.parseInt(st.nextToken());
			tA[i] = numA;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int j = 0; j < tc; j++) {
			int numB = Integer.parseInt(st.nextToken());
			tB[j] = numB;
		}
		
		Arrays.sort(tA);
		Arrays.sort(tB, Collections.reverseOrder());
		
		for(int k = 0; k < tc; k++) {
			answer = answer + (tA[k] * tB[k]);
		}
		
		System.out.println(answer);
	}
}
