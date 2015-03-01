import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class Home {

	
	
	
	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("src/applicationContext.xml") ;
		
		 
		 BeanFactory bef = new XmlBeanFactory(resource);
		
		Test t = (Test)bef.getBean("test");
		System.out.println(t.getStudent());
		 
		 
       
		 
		 
	}
}
