package tryThis;

import java.util.Scanner;

public class If2525{
	public static void main(String[] args) {
		/**
		 * 내 방식 : 시간과 분을 따로 나누어 계산
		 * 1. 분끼리 합산
		 * 2. 시간 : 현재hour + (현재min+ 베이킹Min을 60으로 나눈 값)
		 * 3. 분: 현재min + 베이킹min 나눈 나머지 값
		 * 4.	조건1: 24시간 넘어가면 0으로 초기화해야하므로   2에서 구한 hour을 24로 나눈 나머지 값 
		 * 	   	조건2: 60분 넘어가면 0으로 초기화해야하므로 3에서 구한 min을 60으로 나눈 나머지 값
		 */
		
		Scanner sc = new Scanner(System.in);
	
		int hour = sc.nextInt(); 
		int min = sc.nextInt();
		int bakingMin = sc.nextInt();

		int resMin = min+bakingMin;  			
		int resHour = hour + (resMin / 60);
		
		if(resHour >= 24)
			resHour =  resHour % 24;
		
		if(resMin >= 60)
			resMin = resMin % 60;
		
		System.out.print(resHour + " ");
		System.out.print(resMin);
	
		/*
		 * 분으로 모두환산하는 방식
		 * 1. 시간을 분으로 환산한 후 모두합한다 (총 합산min).
		 * 2. 시간: 1의 값을 60으로 나눈 값
		 * 3. 분: 1의 값을 60으로 나눈 나머지 값
		 * 4. 	조건1: 24시간이 넘어가면 0으로 초기화 해야하므로 2의 hour을 24로 나눈 나머지 값
		 * 		조건2: 60분이  넘어가면 0으로 초기화 해야하므로 3의 min을 60으로 나눈 나머지 값
		 */
		int hour2 = sc.nextInt();
		int min2 = sc.nextInt();
		int bakingMin2 = sc.nextInt();
		
		int totalMin = (hour2 * 60) + min2 + bakingMin2;
			hour2 = totalMin / 60;
			min2 = totalMin % 60;
			if(hour2 >= 24) 
				hour2 %= 24;
			if(min2 >= 60) 
				min2 %= 60;
				System.out.print(hour2 + " ");
				System.out.print(min2);
		sc.close();
		
	}
	
	
}
