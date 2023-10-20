package section16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * 
 * List
 * 	컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 	선형 배열 객체
 * 	가변 배열 객체
 * 	인덱스 값이 있다.
 * 
 * 
 */

public class Collection02 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//데이터 저장하기
		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");
		list.add("꼬부기");
		list.add("버터플");
		list.add("야도란");
		list.add("피존투");
		list.add("또가스");
		
		//저장된 데이터 특정 인덱스 값으로 얻어오기
		String pokemon = list.get(6);
		System.out.println("list 6 인덱스 값: " + pokemon);
		
		//저장된 데이터 특정 인덱스 값으로 삭제
		list.remove(1);
		System.out.println("저장된 데이터 개수: " + list.size());
		
		System.out.println("1번 인덱스 값: " + list.get(1));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}
		
		//특정 인덱스 데이터 삽입
		list.add(4, "잠만보");
		
		//향상된 for 문
		for(String name: list) {
			System.out.println("name: " + name);
		}
		
		//LinkedList 삽입 삭제 성능이 좋다.
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("메타몽");
		linkedList.add("이브이");
		
		for(String mon: linkedList) {
			System.out.println("mon: " + mon);
		}
		
		
		//ArrayList와 동일한 기능 + Thread Safe
		List<String> vec = new Vector<String>();
		vec.add("슈퍼맨");
		vec.add("베트맨");
		for(String hero: vec) {
			System.out.println("hero: " + hero);
		}
		
	}

}
