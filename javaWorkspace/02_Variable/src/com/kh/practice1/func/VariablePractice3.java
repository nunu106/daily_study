package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
//키보드의 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
//계산공식) 면적: 가로*세로
//		  둘레: (가로 + 세로)*2
	
	public void printVariable() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double 가로 = sc.nextDouble();
		
		System.out.println("세로 : ");
		double 세로 = sc.nextDouble();
		
		System.out.println("면적 : " +(가로 * 세로));
		System.out.println("둘레 : " +((가로 + 세로)*2));
	}
	
}
