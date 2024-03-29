package com.kh.variable;

public class A_variable {

	//시급과 근무 일수를 곱해서 월급을 계산하는 프로그램
	public void printVariable() {
		
		//sysout + space +_ ctrl
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급 : 18500");
		System.out.println("근무시간 : 6");
		System.out.println("근무일수 : 20");
		
		//월급 = 시급 x 근무시간 x 근무일수
		//전은우: 0000원 형식으로 출력
		
		System.out.println("전은우씨의 월급은 " + (18500 * 6 * 20) + " 원 입니다.");
		//""안에서 연산기호들은 연산 역할을 하는게 아니라 문자의 역할밖에 못함. "+~~~+" 따옴표 안에 +와 함께 넣어야 함
		
		//변수 사용 후
		System.out.println("===변수 사용 후===");
		int 시급 = 19900; //4byte 저장공간 확보
		int 근무시간 = 6;//4byte 저장공간 확보
		int 근무일수 = 20;//4byte 저장공간 확보
		
		System.out.println("전은우씨의 월급은 " + (시급 * 근무시간 * 근무일수) + " 원 입니다.");//변수 이름 넣으면 됨
		/*
		 * 변수를 사용하는 이유
		 * 1) 변수는 우선적으로 값에 의미를 부여할 목적으로 사용하므로 가독성이 좋다!!!
		 * 2) 한번 값을 기록해두고, 필요할 때마다 재사용 할 수 있으므로 생산성이 좋다
		 * 3) 유지보수를 쉽게 할 수 있다.
		 *  */
		
	}
	
	//변수의 선언
	public void declareVariable() {//일반 메서드
		//int a = 1; //지역변수 : {}안에서 사용하는 변수
		/*
		 * 변수의 선언 ? 메모리에 값을 저장하기 위한 저장공간을 확보하는 것. 필요할 때마다 꺼내쓰므로, 변수의 이름 필요함
		 * [표현법]
		 * 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지ㅏ, 어떤 크기의 값을 담아낼지에 따라서 변수의 크기 및 모양을 지정한다.
		 * 
		 * 변수명 : 변수의 이름을 직관적으로 정하는 부분
		 * 
		 * 주의할 점 : 변수명 명명규칙 
		 * 1. 변수명은 "소문자"로 시작하게끔 지어줄 것.
		 * 		- ex) String user;(o)
		 * 			  String username;(x) 변수의 의미 상 사용자 + 이름
		 *  		  ***String userName;(o)이어 붙여지는 단어의 첫글자를 대문자로 표기하는게 관례(낙타등 표기법)
		 * 2. 같은 영역 {} 안에서는 동일한 변수명 사용 금지
		 * 3. 해당 영역에 선언된 변수는 해당 영역에서만 사용할 것.
		 * 
		 * 
		   */
		
		//1. 논리형 변수 선언(1byte) =>true/false
		boolean isTrue; //1byte;
		
		//2. 숫자형.
		//2_1. 정수형 (외울필요는 없고 대략적인 값만 알아두기)
		byte bNum; //1byte(-128 ~127)
		short sNum;//2byte(-32,768 ~ 32,767)
		int iNum;//4byte (-2,147,483,648 ~ 2,147,483,647) => 정수형 대표 자료형
		System.out.println(12345);//정수형
		System.out.println(12345.1);//실수형
		long lNum;//8byte (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		
		
		//2_2. 실수형
		float fNum;//4byte; => 소숫점 아래 7자리까지 표현가능, 다른 정수형들보다 크다.?
		double dNum;//4byte; => 소숫점 아래 15자리까지 표현가능
					//		 => double이 좀 더 정확한 값을 저장할 수 있다.
		
		//3. 문자형(기본 자료형)
		char ch; //2byte  0~65,535(유니코드문자)
		
		//4. 문자열(참조자료현) => 나중에 자세히 다뤄볼 예정. 자바에서는 기본 자료형처럼 출력됨
		String str;
		
		
		//9개의 변수 선언.
		
		/*
		 * 변수에 값대입
		 * [표현법]
		 * 변수명  =  값 (값을 담아주는 대입연산자 "=")
		 * =(대입연산자)
		 *
		 * */
		
		isTrue = true;
		
		bNum = 1; 
		sNum = 2;
		iNum = 4;
		lNum = 8L;//long 자료형임을 알려주기 위해 소문자, 대문자 L을 표기함
		
		fNum = 4.0f;//반드시 f를 붙여야 함.
		dNum = 8.0;
		
		ch = 'A'; //반드시 ''(작은 따옴표) 안에 넣어줘야 함, 무조건 한글자 'AB'안됨
		str = "abc"// 반드시 ""(쌍따옴표)안에 넣어줘야 한다. 한글자 이상 가능
		
	}
	
	public void initVariable() {
		/*
		 * 변수 "선언"과 동시에 값을 "대입" => 초기화 
		 * [표현법]
		 * 자료형 변수명 = 값(리터럴)
		 * */
		
		boolean isTrue = true;
				
		int longInteger = 999_999_999;//_는 가독성 확보용, longInteger저장될 때는 사라짐
		
		int age = 20;
		age = 21;
		// final 상수 예약어, 변수에 담긴 값을 바꿀 수 없게 하기 위함.
		final int AGE = 20;
		//age

	}
}
