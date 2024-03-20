package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 변수에 기록
public class B_KeyboardInput {

	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);//Scanner 자바 기본 유틸리티 프로그램? in 은 입력
		//사용자의 인적사항 입력받기
		//이름, 나이, 키
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드
		//1) nextLine() :사용자가 입력한 값 중 개행(/n)이 있을 경우 공백에 무관하게 개행 이전까지 출력해준다.**
		//2) next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지 출력
		// (/n)엔터 칠 때마다 개행 문자 있음. 보이진 않음
		
		System.out.println("당신의 나이는 몇 살 입니까?");
		int age = sc. nextInt();//사용자가 입력한 값을 int자료형으로 변환
		
		System.out.println("당신의 키는 몇 cm입니까 ?");
		double height = sc.nextDouble();
		
		//sc.nextLine();// 입력버퍼에 남이있는 개행 문자를 날림 
		
		System.out.println("당신이 사는 곳은 ?");
		String address = sc.nextLine();//입력못하는 이유
		
		//System.out.println(address.charAt(1));
		//문자열. charAt(인덱스) : 문자열 인덱스 위치에 있는 문자를 추출
		//전은우.chartAt(2) -> 0: 전, 1: 은, 2: 우
		
 		System.out.println(address + " : 주소"+height+" cm,"
 				+ age + " 세" + name+ "님 안녕하세요");
 						
	}
}
