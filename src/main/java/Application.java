import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.ISpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {
	
	public static void main(String args[]) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ISpeakerService service = new SpeakerServiceImpl();
		ISpeakerService service = appContext.getBean("speakerService", ISpeakerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}
	
}
