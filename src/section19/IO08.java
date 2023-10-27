package section19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 
 * ObjectInputStream / ObjectOutputStream
 * 	객체를 바이트 스트림으로 읽고 쓰는 클래스
 * 
 * Serializable
 * 	객체를 직렬화하기 위한 인터페이스, 객체를 일련의 바이트(byte)로 변환하는 것을 말한다.
 * 
 * 
 */

public class IO08 {
	
	public static void main(String[] args) {
		
		PokemonVO pokemonVO = new PokemonVO();
		
		pokemonVO.setNo("025");
		pokemonVO.setName("피카츄");
		pokemonVO.setType("전기");
		
		String filePath = "./upload/pokemon.obj";
		
		try(
				FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				) {
			oos.writeObject(pokemonVO);
			
			System.out.println("pokemonVO 객체를 pokemon.obj 파일로 백업");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
