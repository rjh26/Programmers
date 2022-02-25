package solution;

import java.io.*;
import java.util.*;

public class Backjoon15270 {//Backjoon15270번 친구 펠린드롬 (DFS Algorithm)
	static int[][] relation; 
	static boolean[] visited;
	static int answer, fNum, rNum;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		fNum = Integer.parseInt(st.nextToken());
		rNum = Integer.parseInt(st.nextToken());
		
		relation = new int[rNum][2];
		
		for(int i = 0; i < rNum; i++) {
			st = new StringTokenizer(br.readLine());
			
			relation[i][0] = Integer.parseInt(st.nextToken());
			relation[i][1] = Integer.parseInt(st.nextToken());
		}
		
		answer = 0;
		visited = new boolean[fNum + 1]; 
		
		DFS(0, 0);
		
		if((answer * 2) < fNum) {
			answer = (answer * 2) + 1; 
		} else {
			answer = answer * 2;
		}
		
		System.out.println(answer);
	}
	
	private static void DFS(int current, int tempAns) {
		if(current > rNum - 1) {
			answer = Math.max(answer, tempAns);
			return;
		}
		
		if(visited[relation[current][0]] || visited[relation[current][1]]) {
			DFS(current + 1, tempAns);
		} else {
			visited[relation[current][0]] = true;
			visited[relation[current][1]] = true;
			
			DFS(current + 1, tempAns + 1);
			
			visited[relation[current][0]] = false;
			visited[relation[current][1]] = false;
			
			DFS(current + 1, tempAns);
		}
	}
}
