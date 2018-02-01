package msg;

public class MessageServiceImpl implements MessageService {
	
	private String message;
	
	public void setMessage(String message) {
		System.out.println("setMessage : " + message);
		this.message = message;
	}
	
	public String getMessage() {
		System.out.println("getMessage : " + message);
		return message;
	}

}
