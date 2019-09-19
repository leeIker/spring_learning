package packageo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
				persono p= (persono) context.getBean("lee");
				System.out.println(p.toString());
				//Father f= p.getFather();
				//System.out.print(f.toString());
			}

	}

