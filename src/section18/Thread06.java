package section18;

public class Thread06 {
	
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		Runnable run = new Runnable() {
			public void run() {
				System.out.println("아무개 스레드 시작!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("아무개 스레드 종료!");
			};
		};
		new Thread(run).start();
		System.out.println("메인스레드 종료!");
	}

}
