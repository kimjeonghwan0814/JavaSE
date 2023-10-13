package section14.access2;

public class inputErrorException extends Exception{
	
	private String message;
	
	public inputErrorException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
