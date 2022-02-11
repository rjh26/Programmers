package solution;

import java.io.*;
import java.util.*;

public class body {//���� 7568�� ��ġ �ǹ�5 (Brute-Force algorithm)
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int hNum = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[hNum][2];
		int[] answer = new int[hNum]; 
		
		for(int i = 0; i < hNum; i++) {//�� ����� Ű, ������ ���� ������ �迭�� ����
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < hNum; j++) {
			int rank = 1;//��� ������� ���� 1�� �ʱ�ȭ
			int curW = arr[j][0];//���� ����� ������
			int curH = arr[j][1];//���� ����� Ű
			
			for(int k = 0; k < hNum; k++) {
				if(curW < arr[k][0] && curH < arr[k][1]) { //����� ������� ��ü������ ���Ͽ� ���� ���� ������� ��ġ�� ū ����� �ִٸ� ���� 1�� �÷��ش�.
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
