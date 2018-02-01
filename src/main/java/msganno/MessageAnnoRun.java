package msganno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageAnnoRun {
	
	public static void main(String[] args) {
		MessageAnnoRun messageRun = new MessageAnnoRun();
		messageRun.execute();
	}
	
	public void execute() {
		BeanFactory ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		MessageAnnoService messageService = ctx.getBean(MessageAnnoService.class);
		System.out.println(messageService.getMessage());
	}
	
}
