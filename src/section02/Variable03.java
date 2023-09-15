package section02;
/*
 * 3. 정수형
 *   byte	(1byte) : -128 ~ +127
 *   short	(2byte) : -32,768 ~ +32,767
 *   int	(4byte) : -2,147,483,648 ~ +2,147,483,647
 *   long	(8byte) : ~
 *   
 *   
 *   Ctrl + s 저장 단축키
 *   Ctrl + Shift + s 전체파일 저장
 *   
 * 
 * 
 */

public class Variable03 {
	public static void main(String[] args) {
		byte num1 = 20;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//byte over flow
		num1 += 108;
		System.out.println(num1);
		
		//숫자 리터럴 값이 int 범위 초과하는 경우
		//L을 붙여 long형임을 컴파일러에게 알려줘야 한다.
		//2진수 값 대입 0b로 시작
		byte num7 = 0b0100;
		//8진수 값 대입 0으로 시작
		short num8 = 010;
		//16진수 값 대입 0x로 시작
		int num9 = 0xFF;
	}
}
