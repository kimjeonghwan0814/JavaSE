package section14;

import section14.access1.NumberPrinter;

/*
 * throws
 * 	자바에서 메서드나 생성자가 예외를 던질 수 있음을 선언하는 키워드
 * 	메서드가 예외를 처리하지 않고 해당 예외를 호출하는 곳으로 넘기고자 할 때 사용.
 * 
 * 
 */

public class ExceptionClass05 {
	
	public static void main(String[] args) throws InterruptedException {
		
		NumberPrinter np = new NumberPrinter();
		
		//첫 번째 예외처리 방법 try ~ catch
		/*
		try {
			np.printNumber();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		//두 번째 예외처리 방법 throws
		np.printNumber();
		
		//throw 키워드 강제로 Exception 발생시킨다.
		throw new NullPointerException();
	}

}
