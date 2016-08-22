

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.act.MyBO;
import com.test.act.MyTestServlet;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		MyBO customer = (MyBO) appContext.getBean("myBO");
		//customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		customer.testing();
		
		
	//	MyTestServlet myservlet = (MyTestServlet) appContext.getBean("myTestServlet");

	}
}