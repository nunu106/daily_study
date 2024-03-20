package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void inputTest() {
	//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력
	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름을 입력하세요 : ");
	String name = sc.nextLine();
	
	System.out.println("성별을 입력하세요(남/여) : ");
	//Q. 남, 여 한글자인데 String, char 중에 뭐가 맞을까
	String gender = sc.nextLine();
	
	System.out.println("나이를 입력하세요 : ");
	int age = sc.nextInt();
	
	System.out.println("키를 입력하세요(cm) : ");
	double height = sc.nextDouble();
	
	System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 "
			+ name + "님 반갑습니다 ^^" );
	}
	
	
}
