package section09;

public class Constructor03 {
	public static void main(String[] args) {
		AniCharactor aniChar1 = new AniCharactor();
		aniChar1.printInfo();
		
		System.out.println("========================");
		
		String[] items = {"또치", "도우너", "마이콜"};
		
		AniCharactor aniChar2 = new AniCharactor("둘리", "아기공룡 둘리", "ENFP", items);
		aniChar2.printInfo();
		
		System.out.println("=========================");
		
		String[] friends = {"진구", "이슬이", "퉁퉁이", "비실이"};
		new AniCharactor(friends);
	}
}
