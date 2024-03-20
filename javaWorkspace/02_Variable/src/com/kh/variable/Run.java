package com.kh.variable;

import java.security.Key;

public class Run {

	public static void main(String[] args) {
		//printVariable함수 호출
		
		//1) A_variable을 main안으로 불러오기, A_v + c+ 스페이스바 - 자동완성됨
		A_variable av = new A_variable();
		
		//2) A_Variable 내부의 printVariable함수를 찾은 후, 함수 호출
		// 연산자 사용하기
		av.printVariable();
		
		B_KeyboardInput bk = new B_KeyboardInput();
		bk.inputTest();
		}

}
