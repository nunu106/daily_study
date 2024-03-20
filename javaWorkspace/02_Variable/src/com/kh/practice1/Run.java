package com.kh.practice1;

import com.kh.practice1.func.VariablePractice1;
import com.kh.practice1.func.VariablePractice2;
import com.kh.practice1.func.VariablePractice3;
import com.kh.practice1.func.VariablePractice4;
//Q. Run파일은 꼭 하나에만 컴파일? 시켜야 하나요? 
//Q. 누적되어 결과가 나올 떄 새로운 프로젝트에 줄 띄어쓰기는 어떻게 하나요?
public class Run {

	public static void main(String[] args) {
		VariablePractice1 vp1 = new VariablePractice1();
		vp1.inputTest();
		
		
		VariablePractice2 vp2 = new VariablePractice2();
		vp2.inputTest();
		
		
		
		VariablePractice3 vp3 = new VariablePractice3();
		vp3.printVariable();
		
		
		
		VariablePractice4 vp4 = new VariablePractice4();
		vp4.printWord();
	}

}
