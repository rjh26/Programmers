package solution;

import java.io.*;
import java.util.*;

public class blackjack {//백준 2798번 블랙잭 Brute-force Algorithm
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int tc = Integer.parseInt(st.nextToken());
		int targetNum = Integer.parseInt(st.nextToken());
		int answer = 0;
	
		Integer[] arr = new Integer[tc];

		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < tc; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int max = 0;
		int temp = 0;
		
		for(int i = 0; i < arr.length - 2; i++) {;
			for(int j = i + 1; j < arr.length - 1; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					temp = arr[i] + arr[j] + arr[k];
					
					if(temp <= targetNum && answer < temp) {
						answer = temp;
					}
				}
			}
		}
		
		System.out.println(answer);
	}
}
