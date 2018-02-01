package msganno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageAnnoServiceImpl implements MessageAnnoService {
	
	@Value("#{msgAnoProperties.message}")
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
