package msg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRun {
	
	public static void main(String[] args) {
		MessageRun messageRun = new MessageRun();
		messageRun.execute();
	}
	
	public void execute() {
		BeanFactory ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageService messageService = ctx.getBean(MessageService.class);
		messageService.setMessage("Main execute");
		System.out.println(messageService.getMessage());
	}
	
}
