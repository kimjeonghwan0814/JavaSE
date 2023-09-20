package section05;
/*
 * 
 * 2. do ~ while 문
 * 	while문과 비슷하지만, 최초 한 번 이상 실행되는 반복문
 * 
 * 
 */

public class Loop02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		}while(count < 100);
	}
}
