package solution;

import java.util.*;
import java.io.*;

public class virus { //백준 2606번 문제
	private static int computerNum, dualComNum, answer;
	private static int [][] matrix;
	private static boolean[] visited;
	
	public static void main(String[] args) throws Exception{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		computerNum = Integer.parseInt(br.readLine());
		dualComNum = Integer.parseInt(br.readLine());
				
		matrix = new int[computerNum + 1][computerNum + 1];
		
		for(int i=0; i<dualComNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int vertex1 = Integer.parseInt(st.nextToken());
			int vertex2 = Integer.parseInt(st.nextToken());
			
			matrix[vertex1][vertex2] = 1;
			matrix[vertex2][vertex1] = 1;
		}	
		
		visited = new boolean[computerNum + 1];
		for(int i=0; i<visited.length; i++){
	         visited[i] = false;
	    }
		
		DFS(matrix, 1);
		
		System.out.println(answer);
	}
	
	public static void DFS(int[][] graph, int startVertex) {
		visited[startVertex] = true;
		for(int i=1; i<graph.length; i++){
			if((graph[startVertex][i] == 1) && (visited[i] == false)){
	        DFS(graph, i);
	        answer += 1;
	        }
	    }
	}
}

