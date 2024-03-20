package co.kh.first; // 패키지 선언부
// 패키지 작성 시 2단계 까지는 도메인의 역순으로 작성한다.(관례)

public class HelloWorld {

	/*
	 *주석(메모) 여러줄 만들 때 사용
	 *메인 메서드는 자바 애플리케이션을 실행하는 시작점 역할을 함
	 *(entry point)
	 *
	 *main메서드는 반드시 아래와 같은 구조로 이루어져 있다.
	 *public static void main(String args[])
	 */
	public static void main(String args[]) { //클래스 영역 시작부분, 'public' 둘어갈 때 파일 이름과 동일해야함
		// 메서드 영역
		// 출력문. 콘솔창에 ()안에 들어간 문자열을 출력해줌.
		System.out.print("Hello World");
	}
}
