package section11;

/*
 * 
 * ****instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는 연산자
 * 
 */
/*
 * null - 아무런 객체를 잠초하지 않는 상태를 나타낸다.
 * 
 * 
 */

import java.util.Scanner;

import section11.access2.Ade;
import section11.access2.Coffee;
import section11.access2.Drink;

public class Polymorphism03 {
	
	public static void main(String[] args) {
		int inputNum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1) 코카콜라 Zero");
		System.out.println("2) 빽다방 황금라떼");
		System.out.println("음료를 선택하세요 >>>");
		
		inputNum = scan.nextInt();
		
		Drink drink = getDrink(inputNum);
		
		drink.printInfo();
		
		scan.close();
	}
	
	public static Drink getDrink(int inputNum) {
		Drink drink = null;
		if(inputNum == 1) {
			drink = new Ade();
		}
		else if(inputNum == 2) {
			drink = new Coffee();
		}
		
		return drink;
	}

}
