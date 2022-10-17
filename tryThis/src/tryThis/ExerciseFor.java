package tryThis;

public class ExerciseFor {
	public static boolean isPrime(int num) {
		if(num == 2) return true;
		
		if(num == 1) return false;
		if(num % 2 == 0) return false;
		
		for(int i = 3; i <= num - 1; i += 2){
			if(num % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		// 1부터 100까지 합
		int sum = 0;
		for(int i = 1; i <= 100 ; i++){
			sum += i;
		}
		
		System.out.println("sum : (from 1 to 100) " + sum);

		// 1부터 100까지 홀수의 합
		int oddSum = 0;
		for(int i = 1; i <= 100; i++){
			boolean isOdd = (i % 2 == 1) ? true : false ;
			if(isOdd){
				oddSum += i;
			}
		}
		System.out.println("oddSum : (from 1 to 100) " + oddSum);
	
		// 구구단
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j ++) {
				System.out.println(i+" X " + j + " = " +i * j);
			}
		}
		
		//*
		//**
		//***
		//****
		//*****
		//******
		//*******
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//      *
		//     **	
		//    ***
		//   ****
		//  *****
		// ******
		//*******
		for(int i = 0; i < 7 ; i++) {
			for(int j = 6; j - i > 0 ; j--){
				System.out.print(" ");
			}
			for (int j = 0; j - i <= 0; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		//구구단 짝수단
		for(int i = 2; i < 9; i++) {
			boolean even  = i % 2 == 0 ? true : false; 

			if(even) {
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + i*j);
				}
			}
		}
		
		//   *
		//  ***
		// *****
		//*******
		for(int i = 0; i < 4; i++){
			for(int j = 3; j - i > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j - (2*i) - 1 < 0; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// 1 ~ 100 사이에 존재하는 소수의 합
		int primeSum = 0; 
		for(int i = 2; i < 100; i++){
			if(isPrime(i)){
				primeSum += i;
				System.out.println(primeSum);
			}
		}
	}

}
