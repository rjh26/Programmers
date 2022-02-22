package solution;

import java.io.*;
import java.util.*;

public class Backjoon16173 {
	public static void main(String[] args) throws Exception {//백준 16173번 점프왕 쩰리(Small)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		Integer[][] arr = new Integer[tc][tc];
		
		for(int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < tc; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Queue<reach> queue = new LinkedList<>();
		boolean[][] visited = new boolean[tc][tc];
		
		queue.add(new reach(0, 0));
		boolean finish = false;
		
		while(!queue.isEmpty()) {
			reach temp = queue.poll();
			
			if(visited[temp.row][temp.col]) {
				continue;
			} 
			
			int move = arr[temp.row][temp.col];
			
			if(move == -1) {
				finish = true;
				break;
			}
			
			visited[temp.row][temp.col] = true;
			
			if(temp.row + move < tc) {
				queue.add(new reach(temp.row + move, temp.col));
			}
			
			if(temp.col + move < tc) {
				queue.add(new reach(temp.row, temp.col + move));
			}
		}
		
		if(finish) {
			System.out.println("HaruHaru");
		} else {
			System.out.println("Hing");
		}			
	}
}

class reach {
	int row;
	int col;
	
	public reach(int row, int col) {
		this.row = row;
		this.col = col;
	}
}

