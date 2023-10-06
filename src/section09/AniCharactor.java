package section09;

public class AniCharactor {
	//속성
	public String name;//이름
	public String animation;//애니메이션명
	public String mbti;//mbti
	public String[] items;//아이템
	
	public AniCharactor() {
		this.name = "도라에몽";
		this.animation = "도라에몽";
		this.mbti = "ESTJ";
		String[] items = {"대나무헬리콥터", "어디로든문"};
		this.items = items;
	}
	
	public AniCharactor(String name, String animation, String mbti, String[] items) {
		this.name = name;
		this.animation = animation;
		this.mbti = mbti;
		this.items = items;
		
	}
	
	public AniCharactor(String[] friends) {
		this();//현재 클래스 생성자의미 가장 위에 선언해야한다.
		printInfo();
		
		for(String friend : friends) {
			System.out.println(friend);
		}
	}
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("animation: " + animation);
		System.out.println("mbti: " + mbti);
		
		for(int i = 0; i < items.length; i++) {
			System.out.println("items["+i+"]: " + items[i]);
		}
	}
}
