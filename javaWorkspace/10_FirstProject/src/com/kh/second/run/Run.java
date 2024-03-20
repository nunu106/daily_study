package com.kh.second.run;

import com.kh.second.Myname; // 패키지 경로가 다른 경우

public class Run {
	
	public static void main(String[] args) {
		
		Myname mn = new Myname();//Myname폴더 내용 메인 메서드로 불러오기
		
		mn.callMyName(); // + - *,  함수 호출
	}
}
