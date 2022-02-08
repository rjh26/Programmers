package solution;

import java.util.*;

public class sugardelivery {//2839¹ø ¼³ÅÁ¹è´Þ
	public static void main(String[] args) throws Exception {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		
		int weight = sc.nextInt();
		
		while(weight > 0) {
			if(weight % 5 == 0) {
				answer += weight / 5;
				break;
			} else {
				weight -= 3;
				answer += 1;
			}
			
			if(weight < 0) {
				answer = -1;
				break;
			}
		}

		System.out.println(answer);
	}
}
