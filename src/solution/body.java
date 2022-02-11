package solution;

import java.io.*;
import java.util.*;

public class body {//백준 7568번 덩치 실버5 (Brute-Force algorithm)
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int hNum = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[hNum][2];
		int[] answer = new int[hNum]; 
		
		for(int i = 0; i < hNum; i++) {//각 사람의 키, 몸무게 정보 이차원 배열애 저장
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < hNum; j++) {
			int rank = 1;//모든 사람들의 순위 1로 초기화
			int curW = arr[j][0];//현재 사람의 몸무게
			int curH = arr[j][1];//현재 사람의 키
			
			for(int k = 0; k < hNum; k++) {
				if(curW < arr[k][0] && curH < arr[k][1]) { //저장된 사람들의 신체정보를 비교하여 만약 현재 사람보다 덩치가 큰 사람이 있다면 순위 1씩 올려준다.
					rank += 1;
				} 
			}
			
			answer[j] =rank;
		}
		
		for(int i = 0; i < hNum; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
