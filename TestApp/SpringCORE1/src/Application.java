import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 
		
		 
			Test t = (Test)ap.getBean("test");
			System.out.println(t.getStudent());
		
	}
}
