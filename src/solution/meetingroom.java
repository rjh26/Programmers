package solution;

import java.io.*;
import java.util.*;

public class meetingroom {//백준 1931번 회의실 배정 실버2 (Greedy Algorithm)
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int meetingNum = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int[][] meetingList = new int[meetingNum][2];
		
		for(int i = 0; i < meetingNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			meetingList[i][0] = start;
			meetingList[i][1] = end;
		}
				
		Arrays.sort(meetingList, new Comparator<int[]>() { 
			@Override 
			public int compare(int[] o1, int[] o2) { 
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0]; 
					} else { 
						return o1[1] - o2[1]; 
					} 
				} 
			}
		);
		
		for(int i = 0; i < meetingNum; i++) { 
			for(int j = 0; j < 2; j++) { 
				System.out.print(meetingList[i][j] + " "); 
			}
			
			System.out.println(); 
		}
		
		int time = -1;
		
		for(int i = 0; i < meetingNum; i++) {
			if(time <= meetingList[i][0]) {
				time = meetingList[i][1];
				answer += 1;
			}
		}

		System.out.println(answer);
	}
}
