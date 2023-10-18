package section15;
/*
 * 
 * String 클래스
 * 	자바에서 문자열을 다루기 위해 사용되는 클래스
 * 	java.lang 패키지에 포함
 * 
 * 
 * 불변(immutable)의 객체 - 생성된 후 메모리에서 값이 변경되지 않는다.(변경불가 객체)
 * 	1. 메모리 절약
 * 	2. 보안성 UP
 * 	3. Thread Safe
 * 
 */
public class JavaLang03 {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("st1: " + System.identityHashCode(str1));
		System.out.println("st2: " + System.identityHashCode(str2));
		System.out.println("st3: " + System.identityHashCode(str3));
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));//equals 호출하는 객체가 null인지 확인이 필요함
		
		str2 += "d";
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		System.out.println("st1: " + System.identityHashCode(str1));
		System.out.println("st2: " + System.identityHashCode(str2));
		System.out.println("st3: " + System.identityHashCode(str3));
		
	}

}
