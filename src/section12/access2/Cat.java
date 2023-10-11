package section12.access2;

public interface Cat {
	
	public static int PAW = 4;//인터페이스에서 변수는 static 상수이다.
	
	public abstract void eat();
	
	//abstract 생략해도 추상메서드
	
	public abstract void sleep();
	
	public abstract void hunt();
}
