package com.kh.third;

public class MethodTest {
	
	public void testA() {
		System.out.println("testA 메서드 호출됨!");//sysout. ctrl+스페이스바
		testB();
	}
	
	
	public void testB() {
		System.out.println("testB 메서드 호출됨!");
		testC();
	}
	
	public void testC() {
		System.out.println("testC 메서드 호출됨!");
	}
	
	public static void main(String[] args) { //main + ctrl+ 스페이스바 (자동완성), 디버깅: 더블클릭, 벌레 누르기
		
		MethodTest mt = new MethodTest();
		mt.testA();
	}

}
