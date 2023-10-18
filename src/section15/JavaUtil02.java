package section15;

import java.util.Random;

public class JavaUtil02 {
	
	public static void main(String[] args) {
		int[] iArray = new int[45];
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i + 1;
		}
		
		Random ran = new Random();
		
		for(int i = 0; i < iArray.length; i++) {
			int cIndex = ran.nextInt(45);
			
			int tmp = iArray[i];
			iArray[i] = iArray[cIndex];
			iArray[cIndex] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(iArray[i] + "/");
		}
	}

}
